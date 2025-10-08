package com.springboot_crud.springboot_crud.Impls;

import com.springboot_crud.springboot_crud.Dtos.TeacherDto;
import com.springboot_crud.springboot_crud.Exception.ResourceNotFoundException;
import com.springboot_crud.springboot_crud.Mappers.TeacherMapper;
import com.springboot_crud.springboot_crud.Models.Teacher;
import com.springboot_crud.springboot_crud.Repositories.TeacherRepository;
import com.springboot_crud.springboot_crud.Services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherRepository repository;
    @Override
    public TeacherDto createTeacher(TeacherDto dto) {
        Teacher teacher= TeacherMapper.dtotoentity(dto);
        repository.save(teacher);
        return TeacherMapper.entitytodto(teacher);
    }

    @Override
    public TeacherDto getTeacherById(Integer tid) {
        Teacher teacher = repository.findById(tid).orElseThrow(()->new ResourceNotFoundException("ID is not Found "+tid));
        return TeacherMapper.entitytodto(teacher);
    }

    @Override
    public List<TeacherDto> getAllTeacher() {
        return repository.findAll().stream().map(TeacherMapper::entitytodto).collect(Collectors.toList());
    }

    @Override
    public TeacherDto updateTeacher(Integer tid, TeacherDto dto) {
        Teacher teacher = repository.findById(tid).orElseThrow(()->new ResourceNotFoundException("ID is not Found "+tid));
        teacher.setName(dto.getName());
        teacher.setAddress(dto.getAddress());
        teacher.setPhno(dto.getPhno());
        teacher.setSubject(dto.getSubject());
        teacher.setDepartment(dto.getDepartment());
        return TeacherMapper.entitytodto(repository.save(teacher));
    }

    @Override
    public void deleteTeacher(Integer tid) {
    Teacher teacher = repository.findById(tid).orElseThrow(()->new ResourceNotFoundException("ID is not Found "+tid));
    repository.deleteById(tid);
    }

    @Override
    public List<TeacherDto> searchTeacher(String name) {
        return repository.searchTeacherByName(name).stream().map(TeacherMapper::entitytodto).collect(Collectors.toList());
    }

    @Override
    public List<Object[]> finddeptTeachersAndStudentsInnerJoin() {
        return repository.finddeptTeachersAndStudentsInnerJoin();
    }

}
