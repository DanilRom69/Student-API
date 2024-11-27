package com.example.test.controller;

import com.example.test.model.Student;
import com.example.test.service.StudentServise;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentServise studentServise;

    @GetMapping
    public List<Student> findAllStudent(){
       return studentServise.findAllStudent();
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentServise.saveStudent(student);
    }
    @GetMapping("/{email}")
    public Student findByEmaill (@PathVariable String email){
        return studentServise.findByEmaill(email);
    }
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return  studentServise.updateStudent(student);
    }
    @DeleteMapping("deletStudent/{email}")
    public void deletedStudent(@PathVariable String email){
        studentServise.deletedStudent(email);
    }
}
