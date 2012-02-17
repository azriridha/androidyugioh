package nettyPipeline;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelDownstreamHandler;

import backend.events.Event;

abstract public class CardPiplineSegment extends SimpleChannelDownstreamHandler {

    public final String cardName;
    
    public CardPiplineSegment() {
     cardName = "default";
    }
    @Override
    public void writeRequested(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        boolean passdown =true;
        if(e.getMessage() instanceof ChannelBuffer){
            ChannelBuffer buff = (ChannelBuffer)e.getMessage();
            
            if(((Object)buff.array()) instanceof Event){
                Event event = (Event)((Object)buff.array());
                passdown = handleEvent(event);
            }
        }
        if(passdown){
            ctx.sendDownstream(e);
        }
    }

    abstract public boolean handleEvent(Event event);
}
