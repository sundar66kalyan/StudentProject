package com.example.StudentDetails.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.StudentDetails.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query(value = "select attendance from prod_db.student where rollnumber=?", nativeQuery = true)
	public Integer getAttendancebyroll(int roll);

	@Query(value = "select name from prod_db.student where rollnumber=?", nativeQuery = true)

	public String getnamebyroll(int roll);

}
