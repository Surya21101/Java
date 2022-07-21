package com.DaoImpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.HibernateUtil;
import com.Dao.UsersDao;
import com.Entity.Users;

public class UsersDaoImpl implements UsersDao {

	@Override
	public void addUser() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter User Id :");
		long user_id = s.nextLong();
		System.out.println("Enter User's FirstName :");
		String fn = s.next();
		System.out.println("Enter User's LastName :");
		String ln = s.next();
		System.out.println("Enter User's Email :");
		String em = s.next();
		System.out.println("Enter User's Age :");
		int ag = s.nextInt();
		Users u = new Users();
		u.setId(user_id);
		u.setFirstName(fn);
		u.setLastName(ln);
		u.setEmail(em);
		u.setAge(ag);
		session.save(u);
		t.commit();
		System.out.println("User record inserted successfully");
		session.close();
	}

	@Override
	public void readUser() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter User Id :");
		long i = s.nextLong();
		Users w = session.get(Users.class,i);
		System.out.println("User Id :"+w.getId()+"User FirstName :"+w.getFirstName()+"User LastName :"
		+w.getLastName()+"User Email :"+w.getEmail()+"User Age :"+w.getAge());	
		session.close();
	}

	@Override
	public void updateUser() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();
		System.out.println("Enter User Id :");
		long j = s.nextLong();
		Users w = session.get(Users.class,j);
		System.out.println("Enter your updated Email :");
		String eml = s.next();
		w.setEmail(eml);
		session.update(w);
		t.commit();
		System.out.println("Updated Successfully");
		session.close();
	}

	@Override
	public void deleteUser() {
		Session session = HibernateUtil.getSessionFactory().openSession();		
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();
		System.out.println("Enter User Id :");
		long k = s.nextLong();
		Users w = session.get(Users.class,k);	
		session.delete(w);
		t.commit();
		System.out.println("Deleted Succesfully");
		session.close();
	}

}
