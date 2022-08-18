package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	// fetch student details by studentName from db table using @query
	@Query("select s from Student s where s.fname=?1")
	Student getStudentByName(String fname);
	
	// fetch student details by studentEmail from db table using @query
	@Query("select e from Student e where e.email=?1")
	Student getStudentByEmail(String email);
	
	// fetch student details by student phone number from db table using @query
	@Query("select p  from Student p where p.phone=?1")
	Student getStudentByPhone(long phone);
	
}
