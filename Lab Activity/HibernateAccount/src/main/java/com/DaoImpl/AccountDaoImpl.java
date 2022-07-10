package com.DaoImpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.HibernateUtil;
import com.Dao.AccountDao;
import com.Entity.Account;

public class AccountDaoImpl implements AccountDao {

@Override
public void createAccount() {
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction t = session.beginTransaction();
Scanner s = new Scanner(System.in);
System.out.println("Enter Account number :");
long accno = s.nextLong();
System.out.println("Enter Account Holder Name :");
String accname = s.next();
System.out.println("Enter Account Type :");
String acctype = s.next();
System.out.println("Account Balance :");
double accbal = s.nextDouble();
Account a = new Account();
a.setAccountNo(accno);
a.setAccountHolderName(accname);
a.setAccType(acctype);
a.setAccBalance(accbal);
session.save(a);
t.commit();
System.out.println("Account record inserted successfully");
session.close();	
}
@Override
public void depositAmt() {
Session session = HibernateUtil.getSessionFactory().openSession();		
Scanner s = new Scanner(System.in);
Transaction t = session.beginTransaction();
System.out.println("Enter User Id :");
long accno = s.nextLong();
Account a = session.get(Account.class,accno);
double amt;  
System.out.println("Enter the amount you want to deposit: ");  
amt = s.nextDouble();  
double bal = a.getAccBalance() + amt; 
a.setAccBalance(bal);
session.update(a);
t.commit();
System.out.println("Your money is sucessfully deposited into your account");
System.out.println("Remaining balance is :"+ a.getAccBalance());
System.out.println("");
session.close();
}
@Override
public void withdrawAmt() {
Session session = HibernateUtil.getSessionFactory().openSession();		
Scanner s = new Scanner(System.in);
Transaction t = session.beginTransaction();
System.out.println("Enter User Id :");
long accno = s.nextLong();
Account a = session.get(Account.class,accno);
double withdraw;  
System.out.println("Enter the amount you want to withdraw: ");
withdraw = s.nextDouble();
if (a.getAccBalance()>withdraw) {
double bal = a.getAccBalance()-withdraw;
a.setAccBalance(bal);
session.update(a);
t.commit();
System.out.println("Balance after withdrawal: " + a.getAccBalance());
session.close();
} else {
System.out.println("Insufficient Balance");
}
}
@Override
public void checkBalance() {
Session session = HibernateUtil.getSessionFactory().openSession();
Scanner s = new Scanner(System.in);	
System.out.println("Enter Account number :");
long accno = s.nextLong();	
Account a = session.get(Account.class,accno);
System.out.println("Remaining Balance is : "+ a.getAccBalance());
System.out.println("");	
session.close();
}
}
