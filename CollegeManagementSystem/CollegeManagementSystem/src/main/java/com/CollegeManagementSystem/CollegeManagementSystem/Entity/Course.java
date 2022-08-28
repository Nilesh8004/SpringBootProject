package com.CollegeManagementSystem.CollegeManagementSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Course")
public class Course {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long l_course_id;
    @Column(length = 50)
    private String sCourseName;


    //Getters and Setters
    public Long getL_course_id() {
        return l_course_id;
    }

    public void setL_course_id(Long l_course_id) {
        this.l_course_id = l_course_id;
    }

    public String getsCourseName() {
        return sCourseName;
    }

    public void setsCourseName(String sCourseName) {
        this.sCourseName = sCourseName;
    }
//latest
    @OneToMany(targetEntity = StudentMaster.class,cascade = CascadeType.ALL)
    //@JoinColumn(name ="CourseStudent_fk",referencedColumnName = "l_course_id")
    private List<StudentMaster> students;

   /* @OneToOne(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private StudentMaster studentMaster;*/
}
