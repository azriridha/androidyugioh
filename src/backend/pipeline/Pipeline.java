package backend.pipeline;

import java.util.Vector;

import backend.events.Event;


public class Pipeline {

    private Vector<Segment> pipeline = new Vector<Segment>();
    public void addSegment(Segment pipeSegment){
        pipeline.add(pipeSegment);
    }
    
    public void removeEvent(Segment pipeSegment){
        pipeline.remove(pipeSegment);
    }
    public void handleEvent(Event newEvent)
    {
        for(Segment pipeSegment : pipeline)
        {
            pipeSegment.handleEvent(newEvent);
        }
    }
}
