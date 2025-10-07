package com.springboot_crud.springboot_crud.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private int sid;
    private String name;
    private int age;
    private String email;
    private String department;
    private double gpa;
    private long phno;
    private String address;
}
