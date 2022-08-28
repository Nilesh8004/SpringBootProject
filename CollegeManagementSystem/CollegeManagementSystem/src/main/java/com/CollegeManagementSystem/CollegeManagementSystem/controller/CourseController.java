package com.CollegeManagementSystem.CollegeManagementSystem.controller;

import com.CollegeManagementSystem.CollegeManagementSystem.Entity.Course;
import com.CollegeManagementSystem.CollegeManagementSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/course/{id}")
    public Course getCourseById(@PathVariable("id") Long id){
        return courseService.getCourseById(id);
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(Course course){
        return courseService.getAllCourses(course);
    }

    @PostMapping("/course")
    public Course saveCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @PutMapping("/course")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/course/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        courseService.deleteCourse(id);
    }
}
