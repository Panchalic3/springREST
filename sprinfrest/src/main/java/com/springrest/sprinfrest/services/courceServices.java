package com.springrest.sprinfrest.services;

import com.springrest.sprinfrest.entities.Courses;

import java.util.List;

public interface courceServices {
    public List<Courses> getCourses();
    public Courses getCourse(Long courseId);
    public Courses addCourse(Courses courses);
    public Courses updateCourse(Courses courses);
    public void deleteCourse(Long courseId);


}
