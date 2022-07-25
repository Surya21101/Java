package com.DaoImpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.HibernateUtil;
import com.Dao.HalfYearlyDao;
import com.Entity.HalfYearlyReport;
import com.Entity.StudentDetails;

public class HalfYearlyImpl implements HalfYearlyDao {

	@Override
	public void EnterMarks() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int id = s.nextInt();
		System.out.println("Enter English Marks/100 :");
		float eng = s.nextFloat();
		System.out.println("Enter Physics Marks/100 :");
		float phy = s.nextFloat();
		System.out.println("Enter Maths Marks/100 :");
		float mat = s.nextFloat();
		System.out.println("Enter Chemistry Marks/100 :");
		float chem = s.nextFloat();
		System.out.println("Enter Computer Science Marks/100 :");
		float cs = s.nextFloat();
		double total = eng+phy+mat+chem+cs;
		double per = (total/500)*100;
		HalfYearlyReport hr = new HalfYearlyReport();
		hr.setStudentID(id);
		hr.setEnglish(eng);
		hr.setPhysics(phy);
		hr.setMaths(mat);
		hr.setChemistry(chem);
		hr.setComputerScience(cs);
		hr.setPercentage(per);
		if (per > 90.00) {
		    hr.setGrade('A');
		} else if ((per >= 85.00) && (per < 90.00)) {
		    hr.setGrade('B');
		} else if ((per >= 80.00) && (per < 85.00)) {
			hr.setGrade('C');
		} else if ((per >= 70.00) && (per < 80.00)) {
			hr.setGrade('D');
		} else if ((per >= 60.00) && (per < 70.00)) {
			hr.setGrade('E');
		} else if ((per >= 50.00) && (per < 60.00)) {
			hr.setGrade('F');
		}
		session.save(hr);
		t.commit();
		System.out.println("                    |  |\r\n" + 
				" ______|        HALF YEARLY MARKS INSERTED SUCCESSFULLY |  |\r\n" + 
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
	public void UpdateMarks() {
		Session session = HibernateUtil.getSessionFactory().openSession();		
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();
		System.out.println("Enter Student Id :");
		int id = s.nextInt();
		HalfYearlyReport h = session.get(HalfYearlyReport.class,id);
		System.out.println("Enter Updated English Marks/100 :");
		float ueng = s.nextFloat();
		System.out.println("Enter Updated Physics Marks/100 :");
		float uphy = s.nextFloat();
		System.out.println("Enter Updated Maths Marks/100 :");
		float umat = s.nextFloat();
		System.out.println("Enter Updated Chemistry Marks/100 :");
		float uchem = s.nextFloat();
		System.out.println("Enter Updated Computer Science Marks/100 :");
		float ucs = s.nextFloat();
		double utotal = ueng+uphy+umat+uchem+ucs;
		double uper = (utotal/500)*100;
		h.setEnglish(ueng);
		h.setPhysics(uphy);
		h.setMaths(umat);
		h.setChemistry(uchem);
		h.setComputerScience(ucs);
		h.setPercentage(uper);
		if (uper > 90.00) {
		    h.setGrade('A');
		} else if ((uper >= 85.00) && (uper < 90.00)) {
		    h.setGrade('B');
		} else if ((uper >= 80.00) && (uper < 85.00)) {
			h.setGrade('C');
		} else if ((uper >= 70.00) && (uper < 80.00)) {
			h.setGrade('D');
		} else if ((uper >= 60.00) && (uper < 70.00)) {
			h.setGrade('E');
		} else if ((uper >= 50.00) && (uper < 60.00)) {
			h.setGrade('F');
		}
		session.update(h);
		t.commit();
		System.out.println("                    |  |\r\n" + 
				" ______|        HALF YEARLY MARKS UPDATED SUCCESSFULLY |  |\r\n" + 
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
	public void DeleteMarks() {
		Session session = HibernateUtil.getSessionFactory().openSession();		
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();	
		System.out.println("Enter Student Id :");
		int id = s.nextInt();
		HalfYearlyReport k = session.get(HalfYearlyReport.class,id);
		session.delete(k);
		t.commit();
		System.out.println("                    |  |\r\n" + 
				" ______|        HALF YEARLY MARKS DELETED SUCCESSFULLY |  |\r\n" + 
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
	public void ShowMarks() {
		Session session = HibernateUtil.getSessionFactory().openSession();	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int id = s.nextInt();
		HalfYearlyReport j = session.get(HalfYearlyReport.class,id);
		StudentDetails f = session.get(StudentDetails.class,id);
		System.out.println("                    |  |\r\n" + 
				" ______|        HALF YEARLY MARKS OF STUDENT |  |\r\n" + 
				"|    # |,\\|/--,_____|__|O___\r\n" + 
				"|    # |  ` o  ,____________)\r\n" + 
				"|    # |( c o ,_____o000____)\r\n" + 
				"|____#_|'.,-'`\r\n" + 
				"       | /|\\");
		System.out.println(" Student Id :"+j.getStudentID()+"\n"+" Student Name :"+f.getStudentName()+"\n"
		+" English Marks :"+j.getEnglish()+"\n"+" Physics Marks :"
		+j.getPhysics()+"\n"+" Maths Marks :"+j.getMaths()+"\n"
		+" Chemistry Marks :"+j.getChemistry()+"\n"+" Computer Science Marks :"
		+j.getComputerScience()+"\n"+" Percentage :"+j.getPercentage()+"\n"+" Grade :"+j.getGrade());
		System.out.println("");
		System.out.println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'");
		System.out.println("");
		session.close();
	}

}
