package com.CollegeManagementSystem.CollegeManagementSystem.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "StudentMaster")
public class StudentMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long lStudentId;
    private String sStudentFirstName;
    private String sStudentLastName;
    private String sStudentEmail;
    private String sStudentPhone;
    @Column(length = 200)
    private String sStudentAddress;
    private String sStudentGender;
   // @Temporal annotation converts back and forth between timestamp and java.util.Date or time-stamp into time.
   // For example, @Temporal(TemporalType.DATE) drops the time value and only preserves the date.
    @Temporal(TemporalType.DATE)
    private Date dStudentDOB;

    @ManyToOne(targetEntity = Course.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="CourseStudent_fk",referencedColumnName = "l_course_id")
    private Course course;

   /*private Long l_course_id;

    public Long getL_course_id() {
        return l_course_id;
    }

    public void setL_course_id(Long l_course_id) {
        this.l_course_id = l_course_id;
    }*/
/*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lCourseId", referencedColumnName = "lCourseId")
    private long l_course_id;*/

    /*@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "l_course_id")
    private Course course;*/
    //Define below in Course Entity model
   // @OneToOne(mappedBy = "StudentMaster")
    //private Course course;

    //@OneToOne(cascade = CascadeType.ALL) define both line to define foreign Key and Define @OneToOne(mappedBy = "address") in 2nd table
    // @JoinColumn(name = "address_id", referencedColumnName = "id")


    public long getlStudentId() {
        return lStudentId;
    }

    public void setlStudentId(long lStudentId) {
        this.lStudentId = lStudentId;
    }

    public String getsStudentFirstName() {
        return sStudentFirstName;
    }

    public void setsStudentFirstName(String sStudentFirstName) {
        this.sStudentFirstName = sStudentFirstName;
    }

    public String getsStudentLastName() {
        return sStudentLastName;
    }

    public void setsStudentLastName(String sStudentLastName) {
        this.sStudentLastName = sStudentLastName;
    }

    public String getsStudentEmail() {
        return sStudentEmail;
    }

    public void setsStudentEmail(String sStudentEmail) {
        this.sStudentEmail = sStudentEmail;
    }

    public String getsStudentPhone() {
        return sStudentPhone;
    }

    public void setsStudentPhone(String sStudentPhone) {
        this.sStudentPhone = sStudentPhone;
    }

    public String getsStudentAddress() {
        return sStudentAddress;
    }

    public void setsStudentAddress(String sStudentAddress) {
        this.sStudentAddress = sStudentAddress;
    }

    public String getsStudentGender() {
        return sStudentGender;
    }

    public void setsStudentGender(String sStudentGender) {
        this.sStudentGender = sStudentGender;
    }

    public Date getdStudentDOB() {
        return dStudentDOB;
    }

    public void setdStudentDOB(Date dStudentDOB) {
        this.dStudentDOB = dStudentDOB;
    }
}
