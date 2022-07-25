package com.Entity;

public class Student {
	private int id;
	private String sname;
	private String email;
	private long phone;
	
	public Student(int id, String sname, String email, long phone) {
		super();
		this.id = id;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	public void display() {
		System.out.println(id + " " + sname + " " + email + " " + phone);
	}
}
