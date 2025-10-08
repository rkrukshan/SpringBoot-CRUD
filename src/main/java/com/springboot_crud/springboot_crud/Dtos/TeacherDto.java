package com.springboot_crud.springboot_crud.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {
    private int tid;
    private String name;
    private String address;
    private long phno;
    private String subject;
    private String department;
}
