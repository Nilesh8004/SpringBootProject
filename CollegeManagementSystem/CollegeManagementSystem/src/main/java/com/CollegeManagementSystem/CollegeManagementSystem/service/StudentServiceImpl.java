package com.CollegeManagementSystem.CollegeManagementSystem.service;

import com.CollegeManagementSystem.CollegeManagementSystem.Entity.StudentMaster;
import com.CollegeManagementSystem.CollegeManagementSystem.dto.CourseDto;
import com.CollegeManagementSystem.CollegeManagementSystem.dto.StudentDto;
import com.CollegeManagementSystem.CollegeManagementSystem.exceptions.ElementNotFoundException;
import com.CollegeManagementSystem.CollegeManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;
    @Override
    public StudentMaster saveStudent(StudentMaster student) {
        return studentRepository.save(student);
    }

    @Override
    public StudentMaster saveStudent1(StudentDto studentdto){
       return studentRepository.save(studentdto.getStudent());
    }
    @Override
    public List<StudentMaster> getAllStudents(StudentMaster student){
        if(studentRepository.existsBy())
        return studentRepository.findAll();
        else return new ArrayList<>();
            //return emptyListObj.add("No Student Found");
    }

    @Override
    public StudentMaster getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow(()-> new ElementNotFoundException("Student Not found, Invalid Id: "+id));
    }
    @Override
    public StudentMaster findBysStudentFirstName(String fname){
        if(studentRepository.existsBysStudentFirstName(fname))
        return studentRepository.findBysStudentFirstName(fname);
        else
            throw new ElementNotFoundException("Student Not Found, Invalid Name: "+fname);
        }

    @Override
    public StudentMaster updateStudent(StudentMaster student)
    {
        return studentRepository.save(student);
    }
    @Override
    public int UpdateStudentAddress(String addr,Long id){
        return studentRepository.UpdateStudentAddress(addr,id);
    }

    @Override
    public Map<String,String> findByStudentId(Long id){
        return studentRepository.findByStudentId(id);
    }
    }

