package com.example.studentresultnew.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.studentresultnew.entity.Result;
import com.example.studentresultnew.entity.Student;
import com.example.studentresultnew.service.ResultService;

@RestController
@RequestMapping(value = "/resultnew")
public class ResultController {

	@Autowired
	RestTemplate rest;

	@Autowired
	ResultService resSer;

	@PostMapping(value = "/addresult")
	public String addReult() {
		String url2 = "http://localhost:8081/marksheet/getall";
		String url1 = "http://localhost:8080/student/getall";

		List<Result> tab = new ArrayList<>();

		ResponseEntity<List<Student>> ex1 = rest.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Student>>() {
				});
		List<Student> stu = ex1.getBody();

		ResponseEntity<List<MarkSheet>> ex2 = rest.exchange(url2, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<MarkSheet>>() {
				});
		List<MarkSheet> mar = ex2.getBody();
		int id = 0;
		int rollnumber;
		String name = null;
		int totalmarks = 0;
		int percentage = 0;

		for (int i = 0; i < stu.size(); i++) {
			id = stu.get(i).getId();
			rollnumber = stu.get(i).getRollnumber();
			name = stu.get(i).getName();
			if (stu.get(i).getAttendance() > 90) {
				totalmarks = (((mar.get(i).getSem1total() + mar.get(i).getSem2total()) / 2) + 5);
			} else {
				totalmarks = ((mar.get(i).getSem1total() + mar.get(i).getSem2total()) / 2);
			}
			if(((mar.get(i).getSem1total() + mar.get(i).getSem2total()) / 2)>100) {
				totalmarks=100;
			}
			percentage=totalmarks;
			tab.add(new Result(id, rollnumber, name, totalmarks, percentage));
		}
		return resSer.addResult(tab);
	}

}
