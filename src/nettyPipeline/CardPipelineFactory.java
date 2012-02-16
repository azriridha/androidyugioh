package nettyPipeline;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;

public class CardPipelineFactory implements ChannelPipelineFactory {

    ChannelPipeline pipeline = Channels.pipeline();
    public ChannelPipeline getPipeline() throws Exception {
        return pipeline;
    }

    public void addToPipeLine(CardPiplineSegment handler){
        pipeline.addLast(handler.cardName, handler);
    }
    public void removeFromPipeLine(CardPiplineSegment handler){
        pipeline.remove(handler);
    }
    
}