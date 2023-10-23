package com.springrest.sprinfrest.controller;

import com.springrest.sprinfrest.entities.Courses;
import com.springrest.sprinfrest.services.courceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private courceServices CourceServices;
    @GetMapping("/home")
    public String home(){
        return  "this is homepage";
    }

    @GetMapping("/courses")
    public List<Courses> getCourses()
    {
        return this.CourceServices.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable Long courseId){
        return  this.CourceServices.getCourse(courseId);
    }

    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses Course){
        return this.CourceServices.addCourse(Course);
    }

    @PutMapping("/courses")
    public Courses updateCourse(@RequestBody Courses Course){
        return this.CourceServices.updateCourse(Course);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long courseId){
        CourceServices.deleteCourse(courseId);
        return new ResponseEntity<>(HttpStatus.OK);




    }
}
