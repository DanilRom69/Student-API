package com.example.test.service.impl;

import com.example.test.dao.StudentDao;
import com.example.test.model.Student;
import com.example.test.service.StudentServise;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class StudentServiseImpl implements StudentServise {
    private final StudentDao dao;
    @Override
    public List<Student> findAllStudent() {
        return dao.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return dao.saveStudent(student);
    }

    @Override
    public Student findByEmaill(String email) {
        return dao.findByEmaill(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return dao.updateStudent(student);
    }

    @Override
    public void deletedStudent(String email) {
        dao.deletedStudent(email);
    }
}
