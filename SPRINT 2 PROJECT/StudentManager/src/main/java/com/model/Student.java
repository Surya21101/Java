package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student_details")
@Entity
public class Student {
    @Id
    @Column(name="roll_no",length=7,unique=true)
	private int id;
    
    @Column(name = "first_name",length=20,nullable = false)
    @NotBlank(message="please enter first name")
	private String fname;
    
    @Column(name = "last_name",length=20)
	private String lname;
    
    @Column(name = "date_of_birth",length=12,nullable = false)
	private String dob;
    
    @Column(name="gender",length=15)
    private String gender;
    
    @Column(name="phone_no",length = 12,unique = true,nullable = false)
	private long phone;
    
    @Column(name="email",length=40,unique = true,nullable = false)
    @Email(message="Enter proper email Id")
    private String email;
    
    @Column(name="address",length = 50,nullable = false)
	private String addr;
    
}
