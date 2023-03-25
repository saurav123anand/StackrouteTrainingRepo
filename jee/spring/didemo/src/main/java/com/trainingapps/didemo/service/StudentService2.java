package com.trainingapps.didemo.service;

import com.trainingapps.didemo.entity.Student;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService2 {
    private StudentRepository2 repository;
    public Student saveStudent(Student student) {
        if(student!=null){
            return repository.save(student);
        }
        return null;
    }
    public Student findById(Integer id){
        for(Student student:getAllStudents()){
            if(student!=null && student.getId()==id){
                return student;
            }
        }
        return null;
    }
    public List<Student> getAllStudents() {
        List<Student> students = repository.findAll();
        return students;
    }
    public void deleteStudentById(Integer id){
        repository.deleteById(id);
    }

}
