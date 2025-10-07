package com.springboot_crud.springboot_crud.Services;

import com.springboot_crud.springboot_crud.Dtos.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto createStudent(StudentDto dto);

    StudentDto getStudentById(Integer sid);

    List<StudentDto> getAllStudents();

    StudentDto updateStudent(Integer sid, StudentDto dto);

    void deleteStudent(Integer sid);

    List<StudentDto> findByAddress(String address);

    List<StudentDto> findByAge(Integer age);

    List<String> findNameDepartmentPhnoByGpa(Double gpa);
}
