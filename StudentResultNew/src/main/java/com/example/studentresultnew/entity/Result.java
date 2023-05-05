package com.example.studentresultnew.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="resultnew")
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int rollnumber;
	private String name;
	private int totalmarks;
	private int percentage;
	
	public Result() {
		
	}

	public Result(int id2 ,int rollnumber2,String name2, int totalmarks2, int percentage2) {
		this.id=id2;
		this.rollnumber=rollnumber2;
		this.name=name2;
		this.totalmarks=totalmarks2;
		this.percentage=percentage2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalMarks() {
		return totalmarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalmarks = totalMarks;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}
