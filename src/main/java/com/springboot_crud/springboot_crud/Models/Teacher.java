package com.springboot_crud.springboot_crud.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int tid;
    private String name;
    private String address;
    private long phno;
    private String subject;
    private String department;

}
