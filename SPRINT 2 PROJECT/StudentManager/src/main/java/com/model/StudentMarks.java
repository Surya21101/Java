package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student_marks")
public class StudentMarks {
	@Id
	@Column(name="roll_no",length=7)
	private int mid;
	
	@Column(name = "name",length=20,nullable = false)
    @NotBlank(message="please enter student name")
	private String name;
	
	@Column(name="eng_marks",length=5)
	private float engMarks;
	
	@Column(name="phy_marks",length=5)
	private float phyMarks;
	
	@Column(name="math_marks",length=5)
	private float mathMarks;
	
	@Column(name="chem_marks",length=5)
	private float chemMarks;
	
	@Column(name="computerscience_marks",length=5)
	private float csMarks;
	
	@Column(name="total_marks")
	double total;
	
	@Column(name="student_percentage")
	double percentage;

}
