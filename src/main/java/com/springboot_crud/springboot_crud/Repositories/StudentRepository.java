package com.springboot_crud.springboot_crud.Repositories;

import com.springboot_crud.springboot_crud.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
