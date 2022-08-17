package com.servicetests;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.model.Student;
import com.model.StudentMarks;
import com.repository.StudentMarksRepository;
import com.repository.StudentRepository;
import com.service.StudentService;

@SpringBootTest
public class StudentServiceTests {

	@Autowired
	private StudentService studentservice;
	
	@MockBean
	private StudentRepository sturepo;
	
	@MockBean
	private StudentMarksRepository smrepo;
	
	//------------------------------STUDENT METHODS------------------------------//
	
	//testing the SaveStudent method
	@Test
	public void testSaveStudent() {
		
		Student s = new Student();
		s.setId(101);
		s.setFname("surya");
		s.setLname("prakash");
		s.setEmail("surya@gmail.com");
		s.setDob("14/11/97");
		s.setPhone(908070605);
		s.setAddr("chennai,TN");
		
        Mockito.when(sturepo.save(s)).thenReturn(s);
        
        assertThat(studentservice.saveStudent(s)).isEqualTo(s);
		
	}
	
	//testing the GetAllStudents method
	@Test
    public void testGetAllStudents() {
		
    	Student s1 = new Student();
		s1.setId(102);
		s1.setFname("vijay");
		s1.setLname("prakash");
		s1.setEmail("vijay@gmail.com");
		s1.setDob("04/01/97");
		s1.setPhone(778070605);
		s1.setAddr("chennai,TN");
		
		Student s2 = new Student();
		s2.setId(103);
		s2.setFname("ajith");
		s2.setLname("prakash");
		s2.setEmail("ajith@gmail.com");
		s2.setDob("12/04/97");
		s2.setPhone(778073505);
		s2.setAddr("chennai,TN");
		
		List<Student> so = new ArrayList<Student>();
		so.add(s1);
		so.add(s2);
    	
		Mockito.when(sturepo.findAll()).thenReturn(so);
			
		assertThat(studentservice.getAllStudents()).isEqualTo(so);
    	
	}
	
	//testing the GetStudentById method
	@Test
	public void testGetStudentById() {
		
		Student s3 = new Student();
		s3.setId(103);
		s3.setFname("vijay");
		s3.setLname("prakash");
		s3.setEmail("vijay@gmail.com");
		s3.setDob("04/01/97");
		s3.setPhone(778070605);
		s3.setAddr("chennai,TN");
		
        Optional<Student> qp = Optional.of(s3);
		
        Mockito.when(sturepo.findById(103)).thenReturn(qp);
        
        assertThat(studentservice.getStudentById(103)).isEqualTo(s3);
		
	}
	
	//testing the DeleteStudentById method
	@Test
    public void testDeleteStudentById() {
	
		Student s4 = new Student();
		s4.setId(102);
		s4.setFname("vijay");
		s4.setLname("prakash");
		s4.setEmail("vijay@gmail.com");
		s4.setDob("04/01/97");
		s4.setPhone(778070605);
		s4.setAddr("chennai,TN");
		
		Optional<Student> p = Optional.of(s4);
		
        Mockito.when(sturepo.existsById(102)).thenReturn(false);
        
        assertThat(sturepo.existsById(p.get().getId()));
		
    }
	
	//testing the UpdateStudentById method
	@Test
    public void testUpdateStudentById() {
	     
		Student s5 = new Student();
		s5.setId(105);
		s5.setFname("ajith");
		s5.setLname("prakash");
		s5.setEmail("ajith@gmail.com");
		s5.setDob("11/05/97");
		s5.setPhone(778440605);
		s5.setAddr("chennai,TN");
		
		Optional<Student> q = Optional.of(s5);
		Student sp = q.get();
		
        Mockito.when(sturepo.findById(105)).thenReturn(q);
        
        sp.setPhone(807058070);
		Mockito.when(sturepo.save(sp)).thenReturn(sp);
		
		assertThat(studentservice.updateStudentById(sp,105)).isEqualTo(sp);
		
    }
	
	//testing the GetStudentByName method
	@Test
	public void testGetStudentByName() {
		
		Student s6 = new Student();
		s6.setId(103);
		s6.setFname("vijay");
		s6.setLname("prakash");
		s6.setEmail("vijay@gmail.com");
		s6.setDob("04/01/97");
		s6.setPhone(778070605);
		s6.setAddr("chennai,TN");
		
        Mockito.when(studentservice.getStudentByName("vijay")).thenReturn(s6);
        
		assertThat(studentservice.getStudentByName("vijay")).isEqualTo(s6);
		
	}
	
	//testing the GetStudentByEmail method
	@Test
	public void testGetStudentByEmail() {
		
		Student s7 = new Student();
		s7.setId(103);
		s7.setFname("vijay");
		s7.setLname("prakash");
		s7.setEmail("vijay@gmail.com");
		s7.setDob("04/01/97");
		s7.setPhone(778070605);
		s7.setAddr("chennai,TN");
		
        Mockito.when(studentservice.getStudentByEmail("vijay@gmail.com")).thenReturn(s7);
        
		assertThat(studentservice.getStudentByEmail("vijay@gmail.com")).isEqualTo(s7);
		
	}
	
	//testing the GetStudentByPhone method
	@Test
	public void testGetStudentByPhone() {
		
		Student s8 = new Student();
		s8.setId(103);
		s8.setFname("vijay");
		s8.setLname("prakash");
		s8.setEmail("vijay@gmail.com");
		s8.setDob("04/01/97");
		s8.setPhone(778070605);
		s8.setAddr("chennai,TN");
		
        Mockito.when(studentservice.getStudentByPhone(778070605)).thenReturn(s8);
        
		assertThat(studentservice.getStudentByPhone(778070605)).isEqualTo(s8);
		
	}
	
	//------------------------------STUDENT MARKS METHODS------------------------------//
	
	//testing the SaveStudentMarks method
	@Test
    public void testSaveStudentMarks() {
	
		StudentMarks m = new StudentMarks();
		m.setMid(101);
		m.setEngMarks(88.8f);
		m.setPhyMarks(77.7f);
		m.setChemMarks(78.8f);
		m.setMathMarks(76.8f);
		m.setCsMarks(89.7f);
		m.setName("surya");
		
		Mockito.when(smrepo.save(m)).thenReturn(m);
			
		assertThat(studentservice.saveStudentMarks(m)).isEqualTo(m);
		
    }
	
	//testing the GetAllStudentMarks method
	@Test
    public void testGetAllStudentsMarks() {
	
		StudentMarks m1 = new StudentMarks();
		m1.setMid(102);
		m1.setEngMarks(78.8f);
		m1.setPhyMarks(97.7f);
		m1.setChemMarks(78.8f);
		m1.setMathMarks(66.8f);
		m1.setCsMarks(69.7f);
		m1.setName("vijay");
		
		StudentMarks m2 = new StudentMarks();
		m2.setMid(103);
		m2.setEngMarks(76.8f);
		m2.setPhyMarks(95.7f);
		m2.setChemMarks(78.8f);
		m2.setMathMarks(65.8f);
		m2.setCsMarks(70.7f);
		m2.setName("ajith");
		
		List<StudentMarks> smo = new ArrayList<StudentMarks>();
		smo.add(m1);
		smo.add(m2);
    	
		Mockito.when(smrepo.findAll()).thenReturn(smo);
			
		assertThat(studentservice.getAllStudentsMarks()).isEqualTo(smo);
		
    }
	
	//testing the GetStudentMarksById method
	@Test
	public void testGetStudentMarksById() {
		
		StudentMarks m3 = new StudentMarks();
		m3.setMid(101);
		m3.setEngMarks(88.8f);
		m3.setPhyMarks(77.7f);
		m3.setChemMarks(78.8f);
		m3.setMathMarks(76.8f);
		m3.setCsMarks(89.7f);
		m3.setName("surya");
		
        Optional<StudentMarks> qp3 = Optional.of(m3);
		
        Mockito.when(smrepo.findById(101)).thenReturn(qp3);
        
        assertThat(studentservice.getStudentMarksById(101)).isEqualTo(m3);
        
	}
	
	//testing the DeleteStudentMarksById method
	@Test
    public void testDeleteStudentMarksById() {
	
		StudentMarks m4 = new StudentMarks();
		m4.setMid(102);
		m4.setEngMarks(78.8f);
		m4.setPhyMarks(97.7f);
		m4.setChemMarks(78.8f);
		m4.setMathMarks(66.8f);
		m4.setCsMarks(69.7f);
		m4.setName("vijay");
		
		Optional<StudentMarks> p = Optional.of(m4);
        Mockito.when(smrepo.existsById(102)).thenReturn(false);
		
		assertThat(smrepo.existsById(p.get().getMid()));
		
    }
	
	//testing the UpdateStudentMarksById method
	@Test
    public void testUpdateStudentMarksById() {
	
		StudentMarks m5 = new StudentMarks();
		m5.setMid(105);
		m5.setEngMarks(76.8f);
		m5.setPhyMarks(95.7f);
		m5.setChemMarks(78.8f);
		m5.setMathMarks(65.8f);
		m5.setCsMarks(70.7f);
		m5.setName("ajith");
		
		Optional<StudentMarks> q1 = Optional.of(m5);
		StudentMarks sp = q1.get();
		
        Mockito.when(smrepo.findById(105)).thenReturn(q1);
        
        sp.setEngMarks(88.8f);
		Mockito.when(smrepo.save(sp)).thenReturn(sp);
		
		assertThat(studentservice.updateStudentMarksById(sp,105)).isEqualTo(sp);
		
    }
	
	//testing the GetStudentMarksByName method
	@Test
	public void testGetStudentMarksByName() {
		
		StudentMarks m6 = new StudentMarks();
		m6.setMid(101);
		m6.setEngMarks(88.8f);
		m6.setPhyMarks(77.7f);
		m6.setChemMarks(78.8f);
		m6.setMathMarks(76.8f);
		m6.setCsMarks(89.7f);
		m6.setName("surya");
		
        Mockito.when(studentservice.getStudentMarksByName("surya")).thenReturn(m6);
        
		assertThat(studentservice.getStudentMarksByName("surya")).isEqualTo(m6);
	}
	
}
