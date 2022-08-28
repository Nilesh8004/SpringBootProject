package com.CollegeManagementSystem.CollegeManagementSystem.repository;
import com.CollegeManagementSystem.CollegeManagementSystem.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
