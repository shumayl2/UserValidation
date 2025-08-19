package com.UserAuthenticationExample.LetsAuthenticate.Service;


import com.UserAuthenticationExample.LetsAuthenticate.Entity.Students;
import com.UserAuthenticationExample.LetsAuthenticate.Repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;

    public List<Students> getAllUser(){
        return studentRepo.findAll();
    }

    public void save(Students students){
        studentRepo.save(students);
    }


    public Students findById(String id){
        Students students = studentRepo.findById(id).orElseThrow();

        return students;
    }

    public void DeleteStudents(String id){
        studentRepo.deleteById(id);
    }


}
