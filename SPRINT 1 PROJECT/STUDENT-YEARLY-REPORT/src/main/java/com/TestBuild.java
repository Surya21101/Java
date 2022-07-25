package com;

import java.util.Scanner;
import com.DaoImpl.AnnualImpl;
import com.DaoImpl.HalfYearlyImpl;
import com.DaoImpl.QuarterlyImpl;
import com.DaoImpl.StudentDetailsImpl;

public class TestBuild {
public static void main(String[] args) {
	StudentDetailsImpl sd = new StudentDetailsImpl();
	QuarterlyImpl qa = new QuarterlyImpl();
	HalfYearlyImpl hy = new HalfYearlyImpl();
	AnnualImpl an = new AnnualImpl();
	
	while (true) {
		Scanner s = new Scanner(System.in);
		System.out.println("_.~\"~._.~\"~._.~\"~._.~\"~._|~ Student Yearly Report System ~|_.~\"~._.~\"~._.~\"~._.~\"~._");
		System.out.println("                                   Enter Choice");
		System.out.println(" 1. Student Details \n 2. Quarterly Report \n 3. HalfYearly Report \n 4. Annual Report \n 5. Exit");
		int ch = s.nextInt();
		switch (ch) {
		case 1:
			Scanner s1 = new Scanner(System.in);
			System.out.println("_.~\"~._.~\"~._.~\"~._.~\"~._|~ Student Details ~|_.~\"~._.~\"~._.~\"~._.~\"~._");
			System.out.println("                             Enter Choice");
			System.out.println(" 1. Create Student Details \n 2. Update Student Details \n 3. Delete Student Details \n 4. Show Student Details \n 5. Back");
		    int ch1 = s1.nextInt();
		    switch (ch1) {
			case 1:
				sd.CreateStudent();
				break;
            case 2:
				sd.Updatestudent();
				break;
            case 3:
	            sd.DeleteStudent();
	            break;
            case 4:
	            sd.ShowStudent();
	            break;
            case 5:
	            System.out.println("GOING BACK TO MAIN MENU !!!");
	            
	            break;
			default:
				System.out.println("      |\\      _,,,---,,_\r\n" + 
						"ZZZzz /,`.-'`'    -.  ;-;;,_\r\n" + 
						"     |,4-  ) )-,_. ,\\ (  `'-'\r\n" + 
						"    '---''(_/--'  `-'\\_)  WRONG CHOICE OF NUMBER !!! TRY AGAIN !");
				System.out.println("");
				System.out.println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'");
				System.out.println("");
				break;
			}
		    
			break;
        case 2:
        	Scanner s2 = new Scanner(System.in);
    	    System.out.println("_.~\"~._.~\"~._.~\"~._.~\"~._|~ Quarterly Report ~|_.~\"~._.~\"~._.~\"~._.~\"~._");
    	    System.out.println("                              Enter Choice");
    	    System.out.println(" 1. Enter Marks \n 2. Update Marks \n 3. Delete Marks \n 4. Show Marks \n 5. Back");
            int ch2 = s2.nextInt();
            switch (ch2) {
			case 1:
				qa.EnterMarks();
				break;
            case 2:
				qa.UpdateMarks();
				break;
            case 3:
	            qa.DeleteMarks();
	            break;
            case 4:
	            qa.ShowMarks();
	            break;
            case 5:
            	System.out.println("GOING BACK TO MAIN MENU !!!");
	            
	            break;
			default:
				System.out.println("      |\\      _,,,---,,_\r\n" + 
						"ZZZzz /,`.-'`'    -.  ;-;;,_\r\n" + 
						"     |,4-  ) )-,_. ,\\ (  `'-'\r\n" + 
						"    '---''(_/--'  `-'\\_)  WRONG CHOICE OF NUMBER !!! TRY AGAIN !");
				System.out.println("");
				System.out.println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'");
				System.out.println("");
				break;
			}
           
			break;
        case 3:
        	Scanner s3 = new Scanner(System.in);
    	    System.out.println("_.~\"~._.~\"~._.~\"~._.~\"~._|~ HalfYearly Report ~|_.~\"~._.~\"~._.~\"~._.~\"~._");
    	    System.out.println("                              Enter Choice");
    	    System.out.println(" 1. Enter Marks \n 2. Update Marks \n 3. Delete Marks \n 4. Show Marks \n 5. Back");
            int ch3 = s3.nextInt();
            switch (ch3) {
			case 1:
				hy.EnterMarks();
				break;
            case 2:
				hy.UpdateMarks();
				break;
            case 3:
	            hy.DeleteMarks();
	            break;
            case 4:
	            hy.ShowMarks();
	            break;
            case 5:
            	System.out.println("GOING BACK TO MAIN MENU !!!");
	           
	            break;
			default:
				System.out.println("      |\\      _,,,---,,_\r\n" + 
						"ZZZzz /,`.-'`'    -.  ;-;;,_\r\n" + 
						"     |,4-  ) )-,_. ,\\ (  `'-'\r\n" + 
						"    '---''(_/--'  `-'\\_)  WRONG CHOICE OF NUMBER !!! TRY AGAIN !");
				System.out.println("");
				System.out.println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'");
				System.out.println("");
				break;
			}
			
			break;
        case 4:
        	Scanner s4 = new Scanner(System.in);
            System.out.println("_.~\"~._.~\"~._.~\"~._.~\"~._|~ Annual Report ~|_.~\"~._.~\"~._.~\"~._.~\"~._");
            System.out.println("                            Enter Choice");
            System.out.println(" 1. Enter Marks \n 2. Update Marks \n 3. Delete Marks \n 4. Show Marks \n 5. Back");
            int ch4 = s4.nextInt();
            switch (ch4) {
			case 1:
				an.EnterMarks();
				break;
            case 2:
				an.UpdateMarks();
				break;
            case 3:
	            an.DeleteMarks();
	            break;
            case 4:
	            an.ShowMarks();
	            break;
            case 5:
            	System.out.println("GOING BACK TO MAIN MENU !!!");
	           
	            break;
			default:
				System.out.println("      |\\      _,,,---,,_\r\n" + 
						"ZZZzz /,`.-'`'    -.  ;-;;,_\r\n" + 
						"     |,4-  ) )-,_. ,\\ (  `'-'\r\n" + 
						"    '---''(_/--'  `-'\\_)  WRONG CHOICE OF NUMBER !!! TRY AGAIN !");
				System.out.println("");
				System.out.println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'");
				System.out.println("");
				break;
			}
	        break;
        case 5:
        	System.out.println("     |\\_/|                  \r\n" + 
            		"     | @ @   THANK YOU BYE!!!! \r\n" + 
            		"     |   <>              _  \r\n" + 
            		"     |  _/\\------____ ((| |))\r\n" + 
            		"     |               `--' |   \r\n" + 
            		" ____|_       ___|   |___.' \r\n" + 
            		"/_/_____/____/_______|");
            System.exit(0);
	        break;

		default:
			System.out.println("      |\\      _,,,---,,_\r\n" + 
					"ZZZzz /,`.-'`'    -.  ;-;;,_\r\n" + 
					"     |,4-  ) )-,_. ,\\ (  `'-'\r\n" + 
					"    '---''(_/--'  `-'\\_)  WRONG CHOICE OF NUMBER !!! TRY AGAIN !");
			System.out.println("");
			System.out.println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'");
			System.out.println("");
			break;
		}
	}
}
}