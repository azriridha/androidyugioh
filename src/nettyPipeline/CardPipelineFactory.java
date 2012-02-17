package nettyPipeline;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelDownstreamHandler;
import org.jboss.netty.channel.ChannelEvent;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

import backend.events.Event;

public class CardPipelineFactory implements ChannelPipelineFactory {

    ChannelPipeline pipeline = Channels.pipeline();
    public ChannelPipeline getPipeline() throws Exception {
        pipeline.addFirst("main handler", new coder());
        return pipeline;
    }

    public void addToPipeLine(CardPiplineSegment handler){
        pipeline.addLast(handler.cardName, handler);
    }
    public void removeFromPipeLine(CardPiplineSegment handler){
        pipeline.remove(handler);
    }
    
}

class coder extends FrameDecoder implements ChannelDownstreamHandler{

    @Override
    protected Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buffer) throws Exception {
        Object event = buffer.array();
        if(event instanceof Event){
         event = (Event) event;
        }
        return event;
    }

    public ChannelBuffer encode(ChannelHandlerContext ctx, Channel channel, byte[] data) throws Exception {
        int length = data.length;

        ChannelBuffer buffer = ChannelBuffers.dynamicBuffer(length);
        buffer.writeBytes(data);

        return buffer;
    }
    
    @Override
    public void handleDownstream(ChannelHandlerContext ctx, ChannelEvent evt) throws Exception {
        if (!(evt instanceof MessageEvent)) {
            ctx.sendDownstream(evt);
            return;
        }

        MessageEvent e = (MessageEvent) evt;
        byte[] originalMessage = (byte[]) e.getMessage();
        ChannelBuffer encodedMessage = encode(ctx, e.getChannel(), originalMessage);

        if (encodedMessage != null) {
            Channels.write(ctx, e.getFuture(), encodedMessage, e.getRemoteAddress());
        }
    }
}