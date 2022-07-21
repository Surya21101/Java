package com;

import java.util.Scanner;

import com.DaoImpl.UsersDaoImpl;

public class TestUsers {
public static void main(String[] args) {
UsersDaoImpl ud = new UsersDaoImpl();
while (true) {
	Scanner s = new Scanner(System.in);
	System.out.println("-------------Welcome to User Record System-------------");
	System.out.println("Enter Choice");
	System.out.println(" 1. Add \n 2. Read \n 3. Update \n 4. Delete \n 5. Exit");
	int ch = s.nextInt();
	switch (ch) {
	case 1:
		ud.addUser();
		break;
    case 2:
		ud.readUser();
		break;
    case 3:
	    ud.updateUser();
	break;
    case 4:
	    ud.deleteUser();
	break;
    case 5:
    	System.out.println("Thank You !");
	    System.exit(0);
	break;
	}
}
}
}
