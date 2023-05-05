 package com.example.StudentDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentDetails.Entity.Student;
import com.example.StudentDetails.Exceptions.StudentAgeException;
import com.example.StudentDetails.Service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	StudentService studser;

	// adding the single StudentDetails
	@PostMapping(value = "/addstudent")
	public String addStudentDetails(@RequestBody Student e) throws StudentAgeException {
		return studser.addStudentDetails(e);
	}

	// get the single StudentDetails
	@GetMapping(value = "/get/{id}")
	public Student getStudentDetails(@PathVariable int id) {
		return studser.getStudentDetails(id);
	}

	// delete the single StudentDetails
	@DeleteMapping(value = "/delete/{id}")
	public String delete(@PathVariable int id) {
		return studser.deleteStudentDetailsbyid(id);
	}

	// add by the list of StudentDetailss
	@PostMapping(value = "/addall")
	public String addListStudentDetails(@RequestBody List<Student> e) {
		return studser.addaListofStudentDetailss(e);
	}

	// get all the list of StudentDetails
	@GetMapping(value = "/getall")
	public List<Student> getlistofStudentDetailss() {
		return studser.getlistofStudentDetailss();
	}

	// update the list of StudentDetailss

	@PutMapping(value = "/update/{id}")
	public String updateStudentDetails(@RequestBody Student id) {
		return studser.updateStudentDetailsbyid(id);
	}

	@GetMapping(value = "/getattendancebyroll/{roll}")
	public Integer getAttendancebyroll(@PathVariable int roll) {
		return studser.getAttendancebyroll(roll);
	}

	@GetMapping(value = "/getnamebyroll/{roll}")
	public String getnamebyroll(@PathVariable int roll) {
		return studser.getnamebyroll(roll);
	}

}
