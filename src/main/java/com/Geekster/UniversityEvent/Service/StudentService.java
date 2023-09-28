package com.Geekster.UniversityEvent.Service;

import com.Geekster.UniversityEvent.Model.Student;
import com.Geekster.UniversityEvent.Model.Type;
import com.Geekster.UniversityEvent.Repo.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudent iStudent;

    public String addstudent(List<Student> newStudent) {
        iStudent.saveAll(newStudent);
        return "students added";
    }

    public List<Student> getAllStudent() {
        return  (List<Student>)  iStudent.findAll();
    }

    public Student getAllStudentById(Integer id) {
        return iStudent.findById(id).get();
    }

    public String removeStudentById(Integer id) {
        iStudent.deleteById(id);
        return " id deleted";
    }

    public String getStudentById(Type department, Integer id) {
        Student cheak=iStudent.findById(id).orElse(null);
        if (cheak!=null){
            cheak.setDepartment(String.valueOf(department));
            iStudent.save(cheak);
            return " department updated ";
        }
        else{
            return " student not found";
        }

    }
}
