package com.springboot_crud.springboot_crud.Services;

import com.springboot_crud.springboot_crud.Dtos.TeacherDto;

import java.util.List;

public interface TeacherService {
    TeacherDto createTeacher(TeacherDto dto);

    TeacherDto getTeacherById(Integer tid);

    List<TeacherDto> getAllTeacher();

    TeacherDto updateTeacher(Integer tid, TeacherDto dto);

    void deleteTeacher(Integer tid);

    List<TeacherDto> searchTeacher(String name);


    List<Object[]> finddeptTeachersAndStudentsInnerJoin();


    List<Object[]> findTeachersAndStudentsRightJoin();

    List<Object[]> findTeachersAndStudentsLeftJoin();
}
