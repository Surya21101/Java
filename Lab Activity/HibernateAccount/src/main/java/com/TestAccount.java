package com;

import java.util.Scanner;
import com.DaoImpl.AccountDaoImpl;

public class TestAccount {
public static void main(String[] args) {
AccountDaoImpl am = new AccountDaoImpl();
while(true) {
Scanner s = new Scanner(System.in);
System.out.println("-------------Welcome to Bank Account System-------------");
System.out.println("Enter Choice");
System.out.println(" 1. CreateAccount \n 2. Deposit \n 3. Withdraw \n 4. CheckBalance \n 5. Exit");
int ch = s.nextInt();
switch (ch) {
case 1:
	am.createAccount();
break;
case 2:
	am.depositAmt();
break;
case 3:
	am.withdrawAmt();
break;
case 4:
	am.checkBalance();
break;
case 5:
	System.out.println("Thank You");
	System.exit(0);
break;
}
}
}
}
