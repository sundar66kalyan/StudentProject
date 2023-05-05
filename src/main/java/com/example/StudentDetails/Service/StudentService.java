package com.example.StudentDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentDetails.Dao.StudentDao;
import com.example.StudentDetails.Entity.Student;
import com.example.StudentDetails.Exceptions.StudentAgeException;

@Service
public class StudentService {

	@Autowired
	StudentDao sdDao;

//add StudentDetails
	public String addStudentDetails(Student e) throws StudentAgeException {

		if (e.getAge() <= 18) {
			throw new StudentAgeException();
		} else {
			return sdDao.addStudentDetails(e);

		}

	}

	// get StudentDetails by id
	public Student getStudentDetails(int id) {
		return sdDao.getbyStudentDetailsid(id);
	}
//delete StudentDetails by id

	public String deleteStudentDetailsbyid(int id) {

		return sdDao.deleteStudentDetailsbyid(id);
	}

	// add list of StudentDetailss

	public String addaListofStudentDetailss(List<Student> e) {
		return sdDao.addlistofStudentDetailss(e);
	}

	// get list of StudentDetailss

	public List<Student> getlistofStudentDetailss() {
		return sdDao.getlistofStudentDetailss();
	}

	// update StudentDetails by id

	public String updateStudentDetailsbyid(Student id) {

		return sdDao.updateStudentDetailsbyid(id);
	}

	public Integer getAttendancebyroll(int roll) {
		return sdDao.getAttendancebyroll(roll);
	}

	public String getnamebyroll(int roll) {
		return sdDao.getnamebyroll(roll);
	}

}
