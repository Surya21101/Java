package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="annual_report")
@Entity
public class AnnualReport {
	@Id
	@Column(length=5,unique=true)
	private int StudentID;
	@Column(length=5)
	private double English;
	@Column(length=5)
	private double Physics;
	@Column(length=5)
	private double Maths;
	@Column(length=5)
	private double Chemistry;
	@Column(length=5)
	private double ComputerScience;
	@Column(length=5)
	private double Percentage;
	private char Grade;
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public double getEnglish() {
		return English;
	}
	public void setEnglish(double english) {
		English = english;
	}
	public double getPhysics() {
		return Physics;
	}
	public void setPhysics(double physics) {
		Physics = physics;
	}
	public double getMaths() {
		return Maths;
	}
	public void setMaths(double maths) {
		Maths = maths;
	}
	public double getChemistry() {
		return Chemistry;
	}
	public void setChemistry(double chemistry) {
		Chemistry = chemistry;
	}
	public double getComputerScience() {
		return ComputerScience;
	}
	public void setComputerScience(double computerScience) {
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
