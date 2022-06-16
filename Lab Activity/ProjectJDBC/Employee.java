import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Employee {
Scanner s = new Scanner(System.in);
int Id,Age,Salary;
String Name,City;
//saving employee details in database
public void saveEmployee() throws SQLException {
System.out.println("Enter Employee Id :");
Id = s.nextInt();
System.out.println("Enter Employee Name :");
Name = s.next();
System.out.println("Enter Employee Age :");
Age = s.nextInt();
System.out.println("Enter Employee City :");
City = s.next();
System.out.println("Enter Employee Salary :");
Salary = s.nextInt();
Connection conn = Helper.con();
PreparedStatement sl = conn.prepareStatement("insert into employee values(?,?,?,?,?)");
sl.setInt(1,Id);
sl.setString(2,Name);
sl.setInt(3,Age);
sl.setString(4,City);
sl.setInt(5,Salary);
sl.executeUpdate();
}
public void fetchEmployee() throws SQLException {
Connection conn = Helper.con();
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery("select * from employee");
while (rs.next()) {
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
} 
}
public void updateEmployee() throws SQLException {
Connection conn = Helper.con();
Statement st = conn.createStatement();
System.out.println("Enter Employee Id :");
Id = s.nextInt();
System.out.println("Enter Employee Name :");
Name = s.nextLine();
System.out.println("Enter Employee Age :");
Age = s.nextInt();
System.out.println("Enter Employee City :");
City = s.nextLine();
System.out.println("Enter Employee Salary :");
Salary = s.nextInt();
st.executeUpdate("update employee set City = '"+ City +"'+ where Id = "+Id);
}
public void deleteEmployee() throws SQLException {
Connection conn = Helper.con();
Statement st = conn.createStatement();
System.out.println("Enter employee Id :");
Id = s.nextInt();
st.executeUpdate("Delete from employee where Id = " + Id);
}
}
