package com.example.test.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private String name;
    private String famil;
    private LocalDate data;
    @NonNull
    private String email;
    private int age;
}
