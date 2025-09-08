package com.UserAuthenticationExample.LetsAuthenticate.Service;


import com.UserAuthenticationExample.LetsAuthenticate.Entity.Students;
import com.UserAuthenticationExample.LetsAuthenticate.Repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service

public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Students> getAllUser(){
        return studentRepo.findAll();
    }

    public void save(Students students){
        students.setSid(UUID.randomUUID().toString());
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
