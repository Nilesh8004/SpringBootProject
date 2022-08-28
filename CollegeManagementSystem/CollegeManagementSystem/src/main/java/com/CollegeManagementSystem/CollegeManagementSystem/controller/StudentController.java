package com.CollegeManagementSystem.CollegeManagementSystem.controller;

import com.CollegeManagementSystem.CollegeManagementSystem.Entity.StudentMaster;
import com.CollegeManagementSystem.CollegeManagementSystem.dto.StudentDto;
import com.CollegeManagementSystem.CollegeManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/student")
    public StudentMaster saveStudent(@RequestBody StudentMaster student){
       return studentService.saveStudent(student);
    }

    //Nagesh plz chk this controler and related code
    @PostMapping("/saveStudent") StudentMaster saveStudent1(@RequestBody StudentDto studentdto){
       return studentService.saveStudent1(studentdto);
    }

    @GetMapping("/listStudents")
    public List<StudentMaster> getAllStudents(StudentMaster student){
       return studentService.getAllStudents(student);
    }

    @GetMapping("/student/{id}")
    public StudentMaster getStudentById(@PathVariable("id") long id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/searchstu/{fname}")
    public StudentMaster findByStudentFirstName(@PathVariable("fname") String fname){
        return studentService.findBysStudentFirstName(fname);
    }

    @PutMapping("/update")
    public StudentMaster updateStudent(@RequestBody StudentMaster student){
        return studentService.updateStudent(student);
    }

    @PutMapping("/updateAddr/{id}/{addr}")
    public int UpdateStudentAddress(@PathVariable("addr") String addr,@PathVariable("id") Long id){
        return studentService.UpdateStudentAddress(addr,id);
    }

    @GetMapping("/getStudentCourse/{id}")
    public Map<String,String> findByStudentIdStudentFirstNameAndCourseName(@PathVariable("id") Long id){
        return studentService.findByStudentId(id);
    }
}
