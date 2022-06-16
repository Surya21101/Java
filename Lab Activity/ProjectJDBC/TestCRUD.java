import java.sql.SQLException;
import java.util.Scanner;
public class TestCRUD {
public static void main(String[] args) throws SQLException {
Employee e = new Employee();
Scanner s = new Scanner(System.in);
int ch;
do {
System.out.println("1. INSERT \n 2. DISPLAY \n 3. UPDATE \n 4. DELETE \n 5. EXIT");
System.out.println("Enter your choice from 1-5");
ch = Integer.parseInt(s.nextLine());
System.out.println("-----------------------------");
switch (ch) {
case 1:
	e.saveEmployee();
	break;
case 2:
	e.fetchEmployee();
	break;
case 3:
	e.updateEmployee();
	break;
case 4:
	e.deleteEmployee();
	break;
case 5:
	System.exit(0);
	break;
}
} while (ch!=5);
}
}
