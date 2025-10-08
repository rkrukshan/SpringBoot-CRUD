package com.springboot_crud.springboot_crud.Repositories;

import com.springboot_crud.springboot_crud.Models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
