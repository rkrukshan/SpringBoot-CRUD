package com.springboot_crud.springboot_crud.Repositories;

import com.springboot_crud.springboot_crud.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query("SELECT s FROM Student s WHERE s.address = :address")
    List<Student> findByAddress(@Param("Address") String address);

    @Query("SELECT s FROM Student s WHERE s.age= :age")
    List<Student> findByAge(@Param("age") Integer age);

    @Query("SELECT s.name,s.department,s.phno FROM Student s WHERE gpa >=:gpa")
    List<String> findNameDepartmentPhnoByGpa(@Param("gpa") Double gpa);


}
