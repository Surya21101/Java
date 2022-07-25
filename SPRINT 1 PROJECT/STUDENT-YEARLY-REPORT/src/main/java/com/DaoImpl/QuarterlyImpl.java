package com.DaoImpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.HibernateUtil;
import com.Dao.QuarterlyDao;
import com.Entity.QuarterlyReport;
import com.Entity.StudentDetails;

public class QuarterlyImpl implements QuarterlyDao {

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
		QuarterlyReport qr = new QuarterlyReport();
		qr.setStudentID(id);
		qr.setEnglish(eng);
		qr.setPhysics(phy);
		qr.setMaths(mat);
		qr.setChemistry(chem);
		qr.setComputerScience(cs);
		qr.setPercentage(per);
		if (per > 90.00) {
		    qr.setGrade('A');
		} else if ((per >= 85.00) && (per < 90.00)) {
		    qr.setGrade('B');
		} else if ((per >= 80.00) && (per < 85.00)) {
			qr.setGrade('C');
		} else if ((per >= 70.00) && (per < 80.00)) {
			qr.setGrade('D');
		} else if ((per >= 60.00) && (per < 70.00)) {
			qr.setGrade('E');
		} else if ((per >= 50.00) && (per < 60.00)) {
			qr.setGrade('F');
		}
		session.save(qr);
		t.commit();
		System.out.println("                    |  |\r\n" + 
				" ______|        QUARTERLY MARKS INSERTED SUCCESSFULLY |  |\r\n" + 
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
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int id = s.nextInt();
		QuarterlyReport q = session.get(QuarterlyReport.class,id);
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
		q.setEnglish(ueng);
		q.setPhysics(uphy);
		q.setMaths(umat);
		q.setChemistry(uchem);
		q.setComputerScience(ucs);
		q.setPercentage(uper);
		if (uper > 90.00) {
		    q.setGrade('A');
		} else if ((uper >= 85.00) && (uper < 90.00)) {
		    q.setGrade('B');
		} else if ((uper >= 80.00) && (uper < 85.00)) {
			q.setGrade('C');
		} else if ((uper >= 70.00) && (uper < 80.00)) {
			q.setGrade('D');
		} else if ((uper >= 60.00) && (uper < 70.00)) {
			q.setGrade('E');
		} else if ((uper >= 50.00) && (uper < 60.00)) {
			q.setGrade('F');
		}
		session.update(q);
		t.commit();
		System.out.println("                    |  |\r\n" + 
				" ______|        QUARTERLY MARKS UPDATED SUCCESSFULLY |  |\r\n" + 
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
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int id = s.nextInt();
		QuarterlyReport qe = session.get(QuarterlyReport.class,id);
		session.delete(qe);
		t.commit();
		System.out.println("                    |  |\r\n" + 
				" ______|        QUARTERLY MARKS DELETED SUCCESSFULLY |  |\r\n" + 
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
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int id = s.nextInt();
		QuarterlyReport qt = session.get(QuarterlyReport.class,id);
		StudentDetails f = session.get(StudentDetails.class,id);
		System.out.println("                    |  |\r\n" + 
				" ______|        QUARTERLY MARKS OF STUDENT |  |\r\n" + 
				"|    # |,\\|/--,_____|__|O___\r\n" + 
				"|    # |  ` o  ,____________)\r\n" + 
				"|    # |( c o ,_____o000____)\r\n" + 
				"|____#_|'.,-'`\r\n" + 
				"       | /|\\");
		System.out.println(" Student Id :"+qt.getStudentID()+"\n"+" Student Name :"+f.getStudentName()+"\n"
		+" English Marks :"+qt.getEnglish()+"\n"+" Physics Marks :"
		+qt.getPhysics()+"\n"+" Maths Marks :"+qt.getMaths()+"\n"
		+" Chemistry Marks :"+qt.getChemistry()+"\n"+" Computer Science Marks :"
		+qt.getComputerScience()+"\n"+" Percentage :"+qt.getPercentage()+"\n"+" Grade :"+qt.getGrade());
		System.out.println("");
		System.out.println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'");
		System.out.println("");
		session.close();
	}

}
