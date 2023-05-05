	package com.example.StudentDetails.Dao;
	
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	
	import com.example.StudentDetails.Entity.Student;
	import com.example.StudentDetails.Repository.StudentRepository;
	
	@Repository
	public class StudentDao {
		
		@Autowired
		StudentRepository sdRepo;
		
	//add StudentDetails
		public String addStudentDetails(Student e) {
			sdRepo.save(e);
			return "successfully saved";
		}
	//get StudentDetails by id
		public Student getbyStudentDetailsid(int id) {
		return sdRepo.findById(id).get();
		
		}
	//delete StudentDetails by id
		public String deleteStudentDetailsbyid(int id) {
			sdRepo.deleteById(id);
		return "successfully deleted";
		}
		
		//add list of StudentDetailss 
		
		public String addlistofStudentDetailss(List<Student> e) {
			sdRepo.saveAll(e);
			return "successfully added to the list";
		}
		//get list of StudentDetailss 
		
		public List<Student> getlistofStudentDetailss() {
			
			return sdRepo.findAll();
		}
		//update StudentDetails by id
		
		public String updateStudentDetailsbyid(Student id) {
			sdRepo.save(id);
			return "successfully updated in the list";
	}
		public Integer getAttendancebyroll(int roll) {
			return sdRepo.getAttendancebyroll(roll);
		}
		public String getnamebyroll(int roll) {
			return sdRepo.getnamebyroll(roll);
		}
		
	
		
	
	}
