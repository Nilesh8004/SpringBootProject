package com.CollegeManagementSystem.CollegeManagementSystem.service;


import com.CollegeManagementSystem.CollegeManagementSystem.Entity.Course;
import com.CollegeManagementSystem.CollegeManagementSystem.exceptions.ElementNotFoundException;
import com.CollegeManagementSystem.CollegeManagementSystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseRepository courseRepository;
    @Override
    public Course getCourseById(Long id) {
         Course course=null;
        /*Optional<Course> optionUserObj = courseRepository.findById(id);
        if(optionUserObj.isPresent()) return optionUserObj.get();
        else throw new ElementNotFoundException("Invalid User id"+id);*/
        return courseRepository.findById(id)
                .orElseThrow(() -> new ElementNotFoundException("Invalid Course id "+id));
    }

    @Override
    public List<Course> getAllCourses(Course course){
        return courseRepository.findAll();
    }

    @Override
    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course){
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id){
        Optional<Course> optionalUserMsg= courseRepository.findById(id);
        if(optionalUserMsg.isPresent())
            courseRepository.deleteById(id);
        else {
            System.out.println("About to throw Exception");
            throw new ElementNotFoundException("Invalid Course id" + id);
        }
        //both code snippet works
       /* courseRepository.findById(id)
                .orElseThrow(()-> new ElementNotFoundException("Invalid Course Id"+id));
        courseRepository.deleteById(id);*/
    }
}
