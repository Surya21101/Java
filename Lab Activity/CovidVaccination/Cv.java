package com;
import java.util.Scanner;
public class Cv {
public void Mcheck(int age , boolean Indian) throws VaccineEligibilityException {
try {
	if (age>=60) {
		if (Indian = true) {
		System.out.println("Eligible for Vaccination");
		}
		} else {
		throw new VaccineEligibilityException("Not Eligible for Vaccination");
		}
} catch (Exception e) {
	System.out.println(e);
}
}
public void Fcheck(int age , boolean Indian) throws VaccineEligibilityException {
try {
	if (age>50) {
		if (Indian = true) {
		System.out.println("Eligible for Vaccination");
		}
		} else {
		throw new VaccineEligibilityException("Not Eligible for Vaccination");
		}
} catch (Exception e) {
System.out.println(e);
}
}
public static void main(String[] args) throws VaccineEligibilityException {
Cv c = new Cv();
Scanner s = new Scanner(System.in);
while (true) {
System.out.println("-------------Covid Vaccination System-------------");
System.out.println("Enter your Gender :");
System.out.println(" 1. Male \n 2. Female \n 3. Exit");
int ch = s.nextInt();
switch (ch) {
case 1:
	System.out.println("Enter your age :");
	int ag = s.nextInt();
	System.out.println("Are you Indian ? : if yes say 'True'");
	boolean na = s.nextBoolean();
	c.Mcheck(ag,na);
	break;
case 2:
	System.out.println("Enter your age :");
	int ag1 = s.nextInt();
	System.out.println("Are you Indian ? : if yes say 'True'");
	boolean na1 = s.nextBoolean();
	c.Fcheck(ag1,na1);
	break;
case 3:
	System.out.println("Thank You !!!");
	System.exit(0);
	break;
}
}
}
}
