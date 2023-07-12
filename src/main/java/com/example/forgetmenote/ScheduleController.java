package com.example.forgetmenote;

import models.Event;
import models.Schedule;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class ScheduleController {



    @ModelAttribute(name = "schedule")
    public Schedule schedule(){
        return new Schedule();
    }

    @ModelAttribute("event")
    public Event showEvent(){
        return new Event();
    }

    @GetMapping("/schedule")
    public String showScheduleForm(){
        return "schedule";
    }

    //handles the post request and executes the function when hitting the submit form
    //also redirects the user after the form is submitted
    @PostMapping
    public String createSchedule(String name){
        Schedule schedule = new Schedule(name);
        return "redirect:/schedule";
    }



}
