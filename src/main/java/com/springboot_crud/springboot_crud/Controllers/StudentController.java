package com.springboot_crud.springboot_crud.Controllers;

import com.springboot_crud.springboot_crud.Dtos.StudentDto;
import com.springboot_crud.springboot_crud.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService service;

@PostMapping("create")
public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto dto){
    return ResponseEntity.status(200).body(service.createStudent(dto));
}

@GetMapping("/{sid}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Integer sid){
    return ResponseEntity.ok(service.getStudentById(sid));
}

@GetMapping("/")
    public ResponseEntity<List<StudentDto>> getAllStudents(){
    return ResponseEntity.ok(service.getAllStudents());
}

@PutMapping("update/{sid}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Integer sid, @RequestBody StudentDto dto){
    return ResponseEntity.status(201).body(service.updateStudent(sid,dto));
}

@DeleteMapping("delete/{sid}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer sid){
        service.deleteStudent(sid);
        return ResponseEntity.ok("Deleted Successfully");
    }

@GetMapping("address")
    public ResponseEntity<List<StudentDto>> findByAddress(@RequestParam String address){
    return ResponseEntity.ok(service.findByAddress(address));
}

@GetMapping("age")
    public ResponseEntity<List<StudentDto>> findByAge(@RequestParam Integer age){
    return ResponseEntity.ok(service.findByAge(age));
}

@GetMapping("gpa")
    public ResponseEntity <List<StudentDto>> findNameDepartmentPhnoByGpa(@RequestParam Double gpa){
    return ResponseEntity.ok(service.findNameDepartmentPhnoByGpa(gpa));
}


}
