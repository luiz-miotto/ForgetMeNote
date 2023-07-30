package com.example.forgetmenote;

import com.example.forgetmenote.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.forgetmenote.repositories.EventRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
//@ComponentScan({"com.example.forgetmenote"})
public class ForgetMeNoteApplication implements CommandLineRunner {

    //Mongo db password is Mongodblumi27@
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final EventRepository eventRepository;

    public ForgetMeNoteApplication(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ForgetMeNoteApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
       List<Event> eventList = eventRepository.findAll();
       for(Event event: eventList ){
           System.out.println(event.getName());
       }




        /*
        String sql = "INSERT INTO event (name, description, event_Type) VALUES ("
                + "'luiz miotto2', 'luiz@whatever.net', 'WORK_EVENT')";
        int rows = jdbcTemplate.update(sql);
        if (rows > 0) {
            System.out.println("A new row has been inserted.");
        }
        */

    }
}
