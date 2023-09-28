package com.Geekster.UniversityEvent.Controller;

import com.Geekster.UniversityEvent.Model.Student;
import com.Geekster.UniversityEvent.Model.Type;
import com.Geekster.UniversityEvent.Repo.IStudent;
import com.Geekster.UniversityEvent.Service.StudentService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("addstudent")
    public String addStudent(@RequestBody List<Student> newStudent){
        return studentService.addstudent(newStudent);
    }

    @GetMapping("getAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("StudentById/{id}")
    public Student  getStudentById(@PathVariable Integer id){
        return studentService.getAllStudentById(id);
    }

    @DeleteMapping("daleteStudent/{Id}")
    public String removeStudentById(@RequestParam Integer Id){
        return studentService.removeStudentById(Id);
    }

    @PutMapping("updateStudent/department/Id")
    public String getStudentById(@RequestParam Type department, @RequestParam Integer Id){
        return studentService.getStudentById(department,Id);
    }


}
