package com.Geekster.UniversityEvent.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentEvent {
    @Id
    private Integer eventId;
    private String eventName;
    private String locationOfEvent;
    private LocalDate date;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm:ss")
    private LocalTime startTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm:ss")

    private LocalTime endTime;
}
