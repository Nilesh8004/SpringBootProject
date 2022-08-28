package com.CollegeManagementSystem.CollegeManagementSystem.service;
import com.CollegeManagementSystem.CollegeManagementSystem.Entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public Course getCourseById(Long id);
    public List<Course> getAllCourses(Course course);

    public Course saveCourse(Course course);

    public Course updateCourse(Course course);

    public void deleteCourse(Long id);
}
