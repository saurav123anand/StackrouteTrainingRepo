package com.trainingapps.didemo.service;

import com.trainingapps.didemo.entity.Student;
import com.trainingapps.didemo.entity.StudentRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {
    private StudentRepository repository;
    public Student saveStudent(Student student) {
            return repository.save(student);
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
    public boolean deleteStudentById(Integer id){
        repository.deleteById(id);
    }

}
