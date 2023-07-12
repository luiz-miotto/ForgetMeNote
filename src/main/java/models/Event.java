package models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Data
@Component
@Document("event")
public class Event {
    private String name;
    private String description;
    private int dateCreated;
    private int scheduledDate;
    private int dueDate;
    private int importance;
    private Event.EventType eventType;

    public enum EventType{
        WORK_EVENT,
        TASK,
        SOCIAL_EVENT,

    }
    public Event(){
        System.out.println("even with no name was created");
    }

    public Event(Event.EventType type){
        this.eventType = type;
    }

    public Event(String name){
        this.name = name;
        System.out.println("event WITH a name was created");
    }
    public Event(String name, String description){
        this.name = name;
        this.description = description;
        System.out.println("event with a name and description was created");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
        System.out.println("name was set");
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Event.EventType getEventType(){
        return this.eventType;
    }
}
