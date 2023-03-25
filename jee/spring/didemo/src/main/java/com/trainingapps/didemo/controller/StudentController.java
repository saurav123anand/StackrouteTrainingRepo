package com.trainingapps.didemo.controller;

import com.trainingapps.didemo.entity.Student;
import com.trainingapps.didemo.service.StudentService;
import com.trainingapps.didemo.service.StudentService2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private StudentService service;

    @GetMapping("/students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> listStudents(){
        return service.getAllStudents();
    }

    @PostMapping("/student")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student response=service.saveStudent(student);
        if(response!=null){
            return new ResponseEntity<>(response,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }
    @DeleteMapping("/students/{studentId}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable Integer studentId){
          Student student=service.findById(studentId);
          if(student!=null){
              service.deleteStudentById(studentId);
              return new ResponseEntity<>(HttpStatus.OK);
          }
          return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }



}
