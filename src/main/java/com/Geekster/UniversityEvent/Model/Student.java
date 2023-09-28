package com.Geekster.UniversityEvent.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private Integer StudentId;
    private  String firstname;
    private  String  lastname;

    private Integer age;
    private  String  department;
}
