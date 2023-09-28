package com.Geekster.UniversityEvent.Service;

import com.Geekster.UniversityEvent.Controller.StudentEventCon;
import com.Geekster.UniversityEvent.Model.StudentEvent;
import com.Geekster.UniversityEvent.Repo.IEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class Eventservice {
    @Autowired
    IEvent iEvent;

    public String addEvent(List<StudentEvent> newEvent) {
        iEvent.saveAll(newEvent);
        return "event added";
    }

    public List<StudentEvent> getAllEvent() {
        return (List<StudentEvent>) iEvent.findAll();

    }

    public List<StudentEvent> getEventbyDate(LocalDate date) {
        return  iEvent.findByDate(date);
    }

    public String updateEventName(Integer id, String name) {
        StudentEvent cheak= iEvent.findById(id).get();
        if (cheak!=null){
            cheak.setEventName(name);
            iEvent.save(cheak);
        }
        return "update event";

    }

    public String removeEventById(Integer eventId) {
        iEvent.deleteById(eventId);
        return "Id removed";
    }
}
