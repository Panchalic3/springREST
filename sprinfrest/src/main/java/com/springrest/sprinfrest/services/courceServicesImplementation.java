package com.springrest.sprinfrest.services;

import com.springrest.sprinfrest.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class courceServicesImplementation implements courceServices {
    List<Courses> list = new ArrayList<>();

    public courceServicesImplementation() {
        list = new ArrayList<>();
        list.add(new Courses(14, "Java", "core java"));
        list.add(new Courses(124, "Spring", "spring boot rest API"));
    }

    @Override
    public List<Courses> getCourses() {
        System.out.println(list);
        return list;
    }

    @Override
    public Courses getCourse(Long courseId) {
        Courses c = null;
        for (Courses course : list) {
            if (course.getId() == courseId) {
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Courses addCourse(Courses courses) {
        list.add(courses);
        return courses;

    }

    @Override
    public Courses updateCourse(Courses input) {
        for (Courses course : list) {
            if (course.getId() == input.getId()) {
                list.remove(course);
                list.add(input);
                break;
            }

        }
        return input;
    }

    @Override
    public void deleteCourse(Long courseId) {
        for (Courses course : list) {
            if (course.getId() == courseId) {
                list.remove(course);
                break;
            }
        }


    }
}
