package com.example.test.service;
import com.example.test.model.Student;
import java.util.List;


public interface StudentServise {
    List<Student> findAllStudent();
    Student saveStudent (Student student);
    Student findByEmaill(String email);
    Student updateStudent (Student student);
    void deletedStudent (String email);

}
