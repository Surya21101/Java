package com.DaoImpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.HibernateUtil;
import com.Dao.StudentDetailsDao;
import com.Entity.StudentDetails;

public class StudentDetailsImpl implements StudentDetailsDao {

	@Override
	public void CreateStudent() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Create Student Id :");
		int id = s.nextInt();
		System.out.println("Create Student Name :");
		String name = s.next();
		System.out.println("Enter Student DOB :");
		String dob = s.next();
		System.out.println("Enter Student's Phone number :");
		long phoneno = s.nextLong();
		System.out.println("Enter Student Address :");
		String addr = s.next();
		StudentDetails d = new StudentDetails();
		d.setStudentID(id);
		d.setStudentName(name);
		d.setDOB(dob);
		d.setPhoneNo(phoneno);
		d.setAddress(addr);
		session.save(d);
		t.commit();
		System.out.println("                    |  |\r\n" + 
				" ______|        STUDENT RECORD INSERTED SUCCESSFULLY |  |\r\n" + 
				"|    # |,\\|/--,_____|__|O___\r\n" + 
				"|    # |  ` o  ,____________)\r\n" + 
				"|    # |( c o ,_____o000____)\r\n" + 
				"|____#_|'.,-'`\r\n" + 
				"       | /|\\");
		System.out.println("");
		System.out.println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'");
		System.out.println("");
		session.close();
	}

	@Override
	public void Updatestudent() {
		Session session = HibernateUtil.getSessionFactory().openSession();		
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();
		System.out.println("Enter Student Id :");
		int id = s.nextInt();
		StudentDetails d = session.get(StudentDetails.class,id);
		System.out.println("Enter Updated Student Name :");
		String uname = s.next();
		System.out.println("Enter Updated Student DOB :");
		String udob = s.next();
		System.out.println("Enter Updated Student's Phone number :");
		long uphoneno = s.nextLong();
		System.out.println("Enter Updated Student Address :");
		String uaddr = s.next();
		d.setStudentName(uname);
		d.setDOB(udob);
		d.setPhoneNo(uphoneno);
		d.setAddress(uaddr);
		session.update(d);
		t.commit();
		System.out.println("                    |  |\r\n" + 
				" ______|        STUDENT RECORD UPDATED SUCCESSFULLY |  |\r\n" + 
				"|    # |,\\|/--,_____|__|O___\r\n" + 
				"|    # |  ` o  ,____________)\r\n" + 
				"|    # |( c o ,_____o000____)\r\n" + 
				"|____#_|'.,-'`\r\n" + 
				"       | /|\\");
		System.out.println("");
		System.out.println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'");
		System.out.println("");
		session.close();
	}

	@Override
	public void DeleteStudent() {
		Session session = HibernateUtil.getSessionFactory().openSession();		
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();	
		System.out.println("Enter Student Id :");
		int id = s.nextInt();
		StudentDetails k = session.get(StudentDetails.class,id);
		session.delete(k);
		t.commit();
		System.out.println("                    |  |\r\n" + 
				" ______|        STUDENT RECORD DELETED SUCCESSFULLY |  |\r\n" + 
				"|    # |,\\|/--,_____|__|O___\r\n" + 
				"|    # |  ` o  ,____________)\r\n" + 
				"|    # |( c o ,_____o000____)\r\n" + 
				"|____#_|'.,-'`\r\n" + 
				"       | /|\\");
		System.out.println("");
		System.out.println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'");
		System.out.println("");
		session.close();	
	}

	@Override
	public void ShowStudent() {
		Session session = HibernateUtil.getSessionFactory().openSession();	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int id = s.nextInt();
		StudentDetails j = session.get(StudentDetails.class,id);
		System.out.println("                    |  |\r\n" + 
				" ______|        STUDENT RECORD DETAILS |  |\r\n" + 
				"|    # |,\\|/--,_____|__|O___\r\n" + 
				"|    # |  ` o  ,____________)\r\n" + 
				"|    # |( c o ,_____o000____)\r\n" + 
				"|____#_|'.,-'`\r\n" + 
				"       | /|\\");
		System.out.println(" Student Id :"+j.getStudentID()+"\n"+" Student Name :"+j.getStudentName()+"\n"
		+" Student DOB :"+j.getDOB()+"\n"+" Student Phone No :"+j.getPhoneNo()+"\n"+" Student Address :"+j.getAddress());
		System.out.println("");
		System.out.println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'");
		System.out.println("");
		session.close();
	}

}
