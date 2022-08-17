package com.service;

import java.util.List;

import com.model.Student;
import com.model.StudentMarks;

public interface StudentService {
	
	//------------------------------STUDENT DETAILS SERVICE------------------------------//

	Student saveStudent(Student student); //save student details in db
	
	List<Student> getAllStudents();  //get all student details
	
	Student getStudentById(int id); //get student details by their id
	
	void deleteStudentById(int id); //delete student details by their id
	
	Student updateStudentById(Student student,int id); //update student details by their id in db
	
	Student getStudentByName(String fname); //get student details by their firstname
	
	Student getStudentByEmail(String email); //get student details by their email
	
	Student getStudentByPhone(long phone); //get student details by their phone number
	
	
	//------------------------------STUDENT MARKS SERVICE------------------------------//
	
	
	StudentMarks saveStudentMarks(StudentMarks studentmarks); //save student marks in db
	
	List<StudentMarks> getAllStudentsMarks(); //get all studentmarks details
	
	StudentMarks getStudentMarksById(int mid); //get studentmarks details by their id
	
	void deleteStudentMarksById(int mid); //delete studentmarks details by their id
	
	StudentMarks updateStudentMarksById(StudentMarks studentmarks,int mid); //update student details by their id in db
	
	StudentMarks getStudentMarksByName(String name); //get studentmark details by their name
	
}
