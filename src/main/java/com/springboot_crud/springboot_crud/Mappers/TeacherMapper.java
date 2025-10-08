package com.springboot_crud.springboot_crud.Mappers;

import com.springboot_crud.springboot_crud.Dtos.TeacherDto;
import com.springboot_crud.springboot_crud.Models.Teacher;

public class TeacherMapper {
    public static TeacherDto entitytodto(Teacher teacher){
        return new TeacherDto(
                teacher.getTid(),
                teacher.getName(),
                teacher.getAddress(),
                teacher.getPhno(),
                teacher.getSubject(),
                teacher.getDepartment()
        );
    }

    public static Teacher dtotoentity(TeacherDto dto){
        return new Teacher(
                dto.getTid(),
                dto.getName(),
                dto.getAddress(),
                dto.getPhno(),
                dto.getSubject(),
                dto.getDepartment()
        );
    }
}
