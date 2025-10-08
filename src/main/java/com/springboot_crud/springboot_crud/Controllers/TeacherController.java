package com.springboot_crud.springboot_crud.Controllers;

import com.springboot_crud.springboot_crud.Dtos.TeacherDto;
import com.springboot_crud.springboot_crud.Services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teacher")
public class TeacherController {
@Autowired
    TeacherService service;

@PostMapping("create")
public ResponseEntity <TeacherDto> createTeacher(@RequestBody TeacherDto dto){
    return ResponseEntity.status(200).body(service.creaateTeacher(dto));
}

@GetMapping("{tid}")
    public ResponseEntity<TeacherDto> getTeacherById(@PathVariable Integer tid){
    return ResponseEntity.ok(service.getTeacherById(tid));
}

@GetMapping("/")
    public ResponseEntity<List<TeacherDto>> getAllTeacher(){
    return ResponseEntity.ok(service.getAllTeacher());
}

@PutMapping("update/{tid}")
    public ResponseEntity<TeacherDto> updateTeacher(@PathVariable Integer tid, @RequestBody TeacherDto dto){
    return ResponseEntity.status(201).body(service.updateTeacher(tid,dto));
}


@DeleteMapping("delete/{tid}")
    public  ResponseEntity<String> deleteTeacher(@PathVariable Integer tid){
    service.deleteTeacher(tid);
    return ResponseEntity.ok("Deleted Successfully");
}
}
