package backend.events;

public class Event{
String cardCode;
EventType eventType;

public Event(EventType eventType, String cardCode) {
    this.eventType = eventType;
    this.cardCode = cardCode;
}
public String getCardCode() {
    return cardCode;
}
public Event setCardCode(String cardCode) {
    this.cardCode = cardCode;
    return this;
}
public EventType getEvent() {
    return eventType;
}
public Event setEvent(EventType event) {
    this.eventType = event;
    return this;
}

}
