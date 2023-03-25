package com.trainingapps.didemo.controller;

import com.trainingapps.didemo.entity.Student;
import com.trainingapps.didemo.service.StudentService2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController2 {
    private StudentService2 service;

    @GetMapping("/students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> listStudents(){
        return service.getAllStudents();
    }

    @PostMapping("/student")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Optional<Student> savedStudent = Optional.of(service.saveStudent(student));
        if((savedStudent.get().getEmail().equals(""))
                || (savedStudent.get().getEmail() == null) ||
                (savedStudent.get().getFirstName().equals(""))
                || (savedStudent.get().getFirstName() == null) ||
                (savedStudent.get().getLastName().equals("")) || (savedStudent.get().getLastName() == null)||
                 (!savedStudent.isPresent())) {
            return new ResponseEntity<Student>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Student>(savedStudent.get(),HttpStatus.CREATED);
    }

    @DeleteMapping("/students/{studentId}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable Integer studentId){
          try{
              service.deleteStudentById(studentId);
              return new ResponseEntity<>(HttpStatus.OK);
          }
          catch (Exception e){
              return new ResponseEntity<>(HttpStatus.NOT_FOUND);
          }
    }



}
