package com.example.test.dao;

import com.example.test.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
@Repository
public class StudentDao {
    private List<Student> STUDENT = new ArrayList<>();


    public List<Student> findAllStudent() {
        return STUDENT;
    }


    public Student saveStudent(Student student) {
         STUDENT.add(student);
         return student;
    }


    public Student findByEmaill(String email) {
        return STUDENT.stream()
                .filter(element -> element.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }


    public Student updateStudent(Student student) {

        var studentIndex = IntStream.range(0,STUDENT.size())
                .filter(index-> STUDENT.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex > -1 ){
            STUDENT.set(studentIndex, student);
            return student;
        }
        return null;
    }


    public void deletedStudent(String email) {
        var srudent = findByEmaill(email);
        if (srudent != null ){
            STUDENT.remove(srudent);
        }
    }
}
