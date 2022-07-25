package com.Entity;

public class Student {
private int id;
private String sname;
private String email;
private long phone;
private Course course;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getPhone() {
	return phone;
}

public void setPhone(long phone) {
	this.phone = phone;
}
public Course getCourse() {
	return course;
}

public void setCourse(Course course) {
	this.course = course;
}

public void display() {
	System.out.println(id + " " + sname + " " + email + " " + phone);
    System.out.println(course.toString());
}
}
