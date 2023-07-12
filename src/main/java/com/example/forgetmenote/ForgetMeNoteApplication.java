package com.example.forgetmenote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.example.forgetmenote.repositories.EventRepository;

@SpringBootApplication()

@EnableMongoRepositories
@ComponentScan({"com.example.forgetmenote"})

public class ForgetMeNoteApplication implements CommandLineRunner {

    //Mongo db password is Mongodblumi27@
    @Autowired
    EventRepository eventRepository;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ForgetMeNoteApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

    }
}
