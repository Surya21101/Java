package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.Entity.Employee;
public class App {
public static void main( String[] args ) {
SessionFactory s = new Configuration().configure().buildSessionFactory();
Session ses = s.openSession();
Transaction t = ses.beginTransaction();
Employee e = new Employee();
e.setEmpId(101);
e.setEmpFirstName("Mamta");
e.setEmpLastName("Boga");
e.setEmpEmail("mamta@gmail.com");
e.setEmpPhone(834822288);
e.setEmpAddr("Mumbai");
e.setEmpSalary(12300.98);	
ses.save(e);
t.commit();
ses.close();
}
}
