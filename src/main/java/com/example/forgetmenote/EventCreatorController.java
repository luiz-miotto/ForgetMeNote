package com.example.forgetmenote;

import models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.forgetmenote.repositories.EventRepository;

@Controller
public class EventCreatorController {

    @Autowired
    EventRepository eventRepository;


    @GetMapping("/createEvent")
    public String showEventForm(Model model){
        model.addAttribute("event", new Event());
        return "createEvent";
    }


    //handles the post request and executes the function when hitting the submit form
    //also redirects the user after the form is submitted
    @PostMapping("/createEvent")
    public String createEvent(@ModelAttribute Event event, Model model){
        model.addAttribute("event", event);
        System.out.println("lets see what happens");
        System.out.println(event.getName());
        System.out.println(event.getEventType());
        System.out.println("event description is: " + event.getDescription());
        eventRepository.save(event);
        return "/createEvent";
    }



}
