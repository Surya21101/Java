import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.Entity.Employee;
public class App {
public static void main( String[] args ) {
//Configuration -activates hibernate framework
//configure -read both cfg files and mapping details
//buildSessionFactory -from cfg object it takes jdbc information and create a jdbc connection
SessionFactory s = new Configuration().configure().buildSessionFactory();
//opens an connection with db and session object perform CRUD
Session ses = s.openSession();
//operation performed in db,save permanent
Transaction t = ses.beginTransaction();
//create object of persistent class
Employee e = new Employee();
//use object to enter data in table using setter method
e.setEmpId(101);
e.setEmpFirstName("Mamta");
e.setEmpLastName("Boga");
e.setEmpEmail("mamta@gmail.com");
e.setEmpPhone(834822288);
e.setEmpAddr("Mumbai");
e.setEmpSalary(12300.98);	
//session object is used to save the persistent object
ses.save(e);
//transaction object to commit changes
t.commit();
//closing session
ses.close();
}
}
