package com.Geekster.UniversityEvent.Repo;

import com.Geekster.UniversityEvent.Model.StudentEvent;
import com.Geekster.UniversityEvent.Service.Eventservice;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface IEvent extends CrudRepository<StudentEvent,Integer> {
    List<StudentEvent> findByDate(LocalDate date);
}
