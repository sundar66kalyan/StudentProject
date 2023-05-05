package com.example.studentresultnew.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentresultnew.dao.ResultDao;
import com.example.studentresultnew.entity.Result;

@Service
public class ResultService {

	@Autowired
	ResultDao resDao;

	public String addResult(List<Result> tab) {
		
		return resDao.addResult(tab);
	}
}
