package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="quarterly_report")
@Entity
public class QuarterlyReport {
	@Id
	@Column(length=5,unique=true)
	private int StudentID;
	@Column(length=5)
	private float English;
	@Column(length=5)
	private float Physics;
	@Column(length=5)
	private float Maths;
	@Column(length=5)
	private float Chemistry;
	@Column(length=5)
	private float ComputerScience;
	@Column(length=5)
	private double Percentage;
	private char Grade;
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public float getEnglish() {
		return English;
	}
	public void setEnglish(float english) {
		English = english;
	}
	public float getPhysics() {
		return Physics;
	}
	public void setPhysics(float physics) {
		Physics = physics;
	}
	public float getMaths() {
		return Maths;
	}
	public void setMaths(float maths) {
		Maths = maths;
	}
	public float getChemistry() {
		return Chemistry;
	}
	public void setChemistry(float chemistry) {
		Chemistry = chemistry;
	}
	public float getComputerScience() {
		return ComputerScience;
	}
	public void setComputerScience(float computerScience) {
		ComputerScience = computerScience;
	}
	public double getPercentage() {
		return Percentage;
	}
	public void setPercentage(double percentage) {
		Percentage = percentage;
	}
	public char getGrade() {
		return Grade;
	}
	public void setGrade(char grade) {
		Grade = grade;
	}
}
