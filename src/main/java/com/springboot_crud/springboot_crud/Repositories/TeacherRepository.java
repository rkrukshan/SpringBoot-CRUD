package com.springboot_crud.springboot_crud.Repositories;

import com.springboot_crud.springboot_crud.Models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
    @Query("SELECT t FROM Teacher t WHERE LOWER(t.name) LIKE LOWER(CONCAT('%',:name,'%'))")
    List<Teacher> searchTeacherByName(@Param("name") String name);

    @Query("SELECT s,t FROM Teacher t INNER JOIN Student s ON t.department = s.department")
    List<Object[]>finddeptTeachersAndStudentsInnerJoin();
}
