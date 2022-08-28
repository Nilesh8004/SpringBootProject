package com.CollegeManagementSystem.CollegeManagementSystem.service;


import com.CollegeManagementSystem.CollegeManagementSystem.Entity.StudentMaster;
import com.CollegeManagementSystem.CollegeManagementSystem.dto.CourseDto;
import com.CollegeManagementSystem.CollegeManagementSystem.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {

     StudentMaster saveStudent(StudentMaster student);

     public StudentMaster saveStudent1(StudentDto studentdto);

     List<StudentMaster> getAllStudents(StudentMaster student);

     StudentMaster getStudentById(Long id);

     StudentMaster findBysStudentFirstName(String fname);

     StudentMaster updateStudent(StudentMaster student);

     int UpdateStudentAddress(String addr, Long id);

     Map<String,String> findByStudentId(Long id);
}
