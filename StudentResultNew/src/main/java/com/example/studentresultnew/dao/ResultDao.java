package com.example.studentresultnew.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.studentresultnew.entity.Result;
import com.example.studentresultnew.repository.ResultRepository;

@Repository
public class ResultDao {

	@Autowired
	ResultRepository resRepo;
	
	public String addResult(List<Result> tab) {
		resRepo.saveAll(tab);
		return "Successfully All Saved";
	}
	
	
	
}
