package backend.pipeline;

import java.util.Vector;

import nettyPipeline.CardPiplineSegment;
import backend.events.Event;


public class Pipeline {

    private Vector<CardPiplineSegment> pipeline = new Vector<CardPiplineSegment>();
    public void addSegment(CardPiplineSegment pipeSegment){
        pipeline.add(pipeSegment);
    }
    
    public void removeEvent(CardPiplineSegment pipeSegment){
        pipeline.remove(pipeSegment);
    }
    public void fireNewEvent(Event newEvent)
    {
        for(CardPiplineSegment pipeSegment : pipeline)
        {
            pipeSegment.handleEvent(newEvent);
        }
    }
}
