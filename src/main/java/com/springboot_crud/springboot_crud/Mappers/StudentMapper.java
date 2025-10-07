package com.springboot_crud.springboot_crud.Mappers;

import com.springboot_crud.springboot_crud.Dtos.StudentDto;
import com.springboot_crud.springboot_crud.Models.Student;

public class StudentMapper {
public static StudentDto entitytodto (Student student){
                        return new StudentDto(
                                student.getSid(),
                                student.getName(),
                                student.getAge(),
                                student.getEmail(),
                                student.getDepartment(),
                                student.getGpa(),
                                student.getPhno(),
                                student.getAddress()
                        );
}

public static Student dtotoentity (StudentDto dto){
                        return new  Student(
                                dto.getSid(),
                                dto.getName(),
                                dto.getAge(),
                                dto.getEmail(),
                                dto.getDepartment(),
                                dto.getGpa(),
                                dto.getPhno(),
                                dto.getAddress()
                        );
}
}
