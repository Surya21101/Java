package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user_details")
@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column(name ="user_name",length = 30,nullable = false)
private String userName;
@Column(name ="user_email",length = 30,nullable = false,unique = true)
private String userEmail;
@Column(name ="user_phone",length = 30,nullable = false,unique = true)
private long userPhone;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public long getUserPhone() {
	return userPhone;
}
public void setUserPhone(long userPhone) {
	this.userPhone = userPhone;
}
}
