package com.UserAuthenticationExample.LetsAuthenticate.Controller;


import com.UserAuthenticationExample.LetsAuthenticate.Entity.Students;
import com.UserAuthenticationExample.LetsAuthenticate.Error.ApiError;
import com.UserAuthenticationExample.LetsAuthenticate.Repository.StudentRepo;
import com.UserAuthenticationExample.LetsAuthenticate.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/id/{id}")
    public ResponseEntity<Students> findbyid(@PathVariable String id){
        Students byId = studentService.findById(id);

        return new ResponseEntity<>(byId, HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<Students>> findAll(){
        List<Students> allUser = studentService.getAllUser();


        return new ResponseEntity<>(allUser,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveStudent(@RequestBody Students students){
        studentService.save(students);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteStudent(@PathVariable String id){
        studentService.DeleteStudents(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
