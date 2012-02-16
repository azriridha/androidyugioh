package backend.pipeline;

import backend.events.Event;

public interface Segment {

   void handleEvent(Event newEvent);
}
