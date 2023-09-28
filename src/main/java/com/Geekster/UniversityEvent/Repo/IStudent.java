package com.Geekster.UniversityEvent.Repo;

import com.Geekster.UniversityEvent.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IStudent extends CrudRepository<Student,Integer>{


}
