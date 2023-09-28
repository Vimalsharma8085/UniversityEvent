package com.Geekster.UniversityEvent.Controller;

import com.Geekster.UniversityEvent.Model.StudentEvent;
import com.Geekster.UniversityEvent.Service.Eventservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class StudentEventCon {
    @Autowired
    Eventservice eventservice;
    @PostMapping("addAllEvent")
    public String addEvent(@RequestBody List<StudentEvent> newEvent){
        return eventservice.addEvent(newEvent);
    }

    @GetMapping("getAllEvents")
    public List<StudentEvent> getAllEvent(){
        return eventservice.getAllEvent();
    }

    @GetMapping("getEventByDate/{date}")
    public List<StudentEvent> getEventbyDate(@PathVariable LocalDate date){
        return  eventservice.getEventbyDate(date);
    }

    @PutMapping("updateEvent/{Id}/{name}")
    public String updateEventName(@PathVariable Integer Id,@PathVariable String name){
        return eventservice.updateEventName(Id,name);
    }

    @DeleteMapping("daleteEvent/{eventId}")
    public String removeEventById(@PathVariable Integer eventId){
        return eventservice.removeEventById(eventId);
    }


}
