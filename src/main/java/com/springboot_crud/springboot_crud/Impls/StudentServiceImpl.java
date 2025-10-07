package com.springboot_crud.springboot_crud.Impls;

import com.springboot_crud.springboot_crud.Dtos.StudentDto;
import com.springboot_crud.springboot_crud.Exception.ResourceNotFoundException;
import com.springboot_crud.springboot_crud.Mappers.StudentMapper;
import com.springboot_crud.springboot_crud.Models.Student;
import com.springboot_crud.springboot_crud.Repositories.StudentRepository;
import com.springboot_crud.springboot_crud.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
@Autowired
    StudentRepository repository;
    @Override
    public StudentDto createStudent(StudentDto dto) {
        Student student = StudentMapper.dtotoentity(dto);
        repository.save(student);
        return StudentMapper.entitytodto(student);
    }

    @Override
    public StudentDto getStudentById(Integer sid) {
         Student student =repository.findById(sid).orElseThrow(()-> new ResourceNotFoundException("ID is not Found "+sid));
         return StudentMapper.entitytodto(student);

    }

    @Override
    public List<StudentDto> getAllStudents() {
        return repository.findAll().stream().map(StudentMapper::entitytodto).collect(Collectors.toList());
    }

    @Override
    public StudentDto updateStudent(Integer sid, StudentDto dto) {
        Student student = repository.findById(sid).orElseThrow(()-> new ResourceNotFoundException("ID is not Found "+ sid));
        student.setName(dto.getName());
        student.setAge(dto.getAge());
        student.setEmail(dto.getEmail());
        student.setDepartment(dto.getDepartment());
        student.setGpa(dto.getGpa());
        student.setPhno(dto.getPhno());
        student.setAddress(dto.getAddress());
        return StudentMapper.entitytodto(repository.save(student));
    }

    @Override
    public void deleteStudent(Integer sid) {
        Student student = repository.findById(sid).orElseThrow(()->new ResourceNotFoundException("ID is not Found "+sid));
        repository.deleteById(sid);
    }

    @Override
    public List<StudentDto> findByAddress(String address) {
        return repository.findByAddress(address).stream().map(StudentMapper::entitytodto).collect(Collectors.toList());
    }

    @Override
    public List<StudentDto> findByAge(Integer age) {
        return repository.findByAge(age).stream().map(StudentMapper::entitytodto).collect(Collectors.toList());
    }

    @Override
    public List<String> findNameDepartmentPhnoByGpa(Double gpa) {
        return repository.findNameDepartmentPhnoByGpa(gpa);
    }


}
