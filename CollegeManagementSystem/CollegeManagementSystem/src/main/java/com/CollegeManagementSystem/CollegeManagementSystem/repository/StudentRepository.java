package com.CollegeManagementSystem.CollegeManagementSystem.repository;

import com.CollegeManagementSystem.CollegeManagementSystem.Entity.StudentMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Map;
@Repository
public interface StudentRepository extends JpaRepository<StudentMaster,Long> {
   public Boolean existsBy();
   public Boolean existsBysStudentFirstName(String fname);

   public StudentMaster findBysStudentFirstName(String fname);

   @Modifying
   @Transactional
   @Query("update StudentMaster s set s.sStudentAddress=?1 where s.lStudentId=?2")
   int UpdateStudentAddress(String addr,Long id);
   /*You can also use named params, like this:
   @Transactional
   @Modifying
   @Query("update EARAttachment ear set ear.status = :status where ear.id = :id")
   int setStatusForEARAttachment(@Param("status") Integer status, @Param("id") Long id);*/

   //Query abc=session.
   //use nativeQuery=true, so we have to write query in database dialect i.e table and columns names as per Databse
   //In Jpa JPQL it uses table names and columns as per Entity names
  //@Query(value = "SELECT * FROM Student_master", nativeQuery = true)

   @Modifying
   @Transactional
   @Query(value = "Select s.s_student_first_name,c.s_course_name from student_master"+
           "inner join Course c on s.l_course_id=s.l_course_id"+
            "where s.l_student_id=?1",nativeQuery = true)
   public Map<String,String> findByStudentId(Long id);
}
