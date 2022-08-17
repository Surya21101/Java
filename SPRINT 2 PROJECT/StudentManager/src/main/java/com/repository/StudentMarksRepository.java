package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.StudentMarks;

public interface StudentMarksRepository extends JpaRepository<StudentMarks,Integer> {
	
	// fetch studentmarks by studentName from db table using @query
	@Query("select m from StudentMarks m where m.name=?1")
	StudentMarks getStudentMarksByName(String name);
	
}
