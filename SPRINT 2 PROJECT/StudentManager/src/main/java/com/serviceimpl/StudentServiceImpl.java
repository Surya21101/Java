package com.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exception.StudentNotFoundException;
import com.model.Student;
import com.model.StudentMarks;
import com.repository.StudentMarksRepository;
import com.repository.StudentRepository;
import com.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository sturepo;
	
	@Autowired
	StudentMarksRepository smrepo;
	
	//------------------------------STUDENT DETAILS SERVICE IMPLEMENTATION------------------------------//

	@Override
	// save student details using student repository object
	public Student saveStudent(Student student) {
		
		return sturepo.save(student);
	}

	@Override
	// get all student details using student repository object
	public List<Student> getAllStudents() {
		
		return sturepo.findAll();
	}

	@Override
	// get student details by their id using student repository object
	public Student getStudentById(int id) {
		
		return sturepo.findById(id).orElseThrow(()-> new StudentNotFoundException("Student by ID " + id + " was not found"));
	}

	@Override
	// delete student details by their id using student repository object
	public void deleteStudentById(int id) {
		
		sturepo.findById(id).orElseThrow(()-> new StudentNotFoundException("Student by ID " + id + " was not found"));
		sturepo.deleteById(id);
		
	}

	@Override
	// update student details by their id using student repository object
	public Student updateStudentById(Student student, int id) {
		
		Student s = sturepo.findById(id).orElseThrow(()-> new StudentNotFoundException("Student by ID " + id + " was not found"));
		
		s.setFname(student.getFname());
		s.setLname(student.getLname());
		s.setDob(student.getDob());
		s.setPhone(student.getPhone());
		s.setEmail(student.getEmail());
		s.setAddr(student.getAddr());
		s.setGender(student.getGender());
		
		sturepo.save(s);
		
		return s;
	}
	
	@Override
	// get student details by their email using student repository object
	public Student getStudentByEmail(String email) {
		
		return sturepo.getStudentByEmail(email);
	}

	@Override
	// get student details by their phone number using student repository object
	public Student getStudentByPhone(long phone) {
		
		return sturepo.getStudentByPhone(phone);
	}
	
	
	//------------------------------STUDENT MARKS SERVICE IMPLEMENTATION------------------------------//
	

	@Override
	// save studentmark details using studentmarks repository object
	public StudentMarks saveStudentMarks(StudentMarks studentmarks) {
		
	double tot = (studentmarks.getEngMarks()+studentmarks.getPhyMarks()
	+studentmarks.getChemMarks()+studentmarks.getCsMarks()+studentmarks.getMathMarks());
	
	double per = (tot/500)*100;
	
	 studentmarks.setTotal(tot);
	 studentmarks.setPercentage(per);

		return smrepo.save(studentmarks);
	}

	@Override
	// get all studentmark details using studentmarks repository object
	public List<StudentMarks> getAllStudentsMarks() {
		
		return smrepo.findAll();
	}

	@Override
	// get studentmark details by their id using studentmarks repository object
	public StudentMarks getStudentMarksById(int mid) {
		
		return smrepo.findById(mid).orElseThrow(()-> new StudentNotFoundException("Student by ID " + mid + " was not found"));
	}

	@Override
	// delete studentmark details by their id using studentmarks repository object
	public void deleteStudentMarksById(int mid) {
		
		smrepo.findById(mid).orElseThrow(()-> new StudentNotFoundException("Student by ID " + mid + " was not found"));
		smrepo.deleteById(mid);
		
	}

	@Override
	// update studentmark details by their id using studentmarks repository object
	public StudentMarks updateStudentMarksById(StudentMarks studentmarks, int mid) {
		
		StudentMarks sm = smrepo.findById(mid).orElseThrow(()-> new StudentNotFoundException("Student by ID " + mid + " was not found"));	
		
		double utot = (studentmarks.getEngMarks()+studentmarks.getPhyMarks()
		+studentmarks.getChemMarks()+studentmarks.getCsMarks()+studentmarks.getMathMarks());
		
		 studentmarks.setPercentage(utot);
		
		 double uper = (utot/500)*100;
		 
		
		sm.setName(studentmarks.getName());
		sm.setEngMarks(studentmarks.getEngMarks());
		sm.setPhyMarks(studentmarks.getPhyMarks());
		sm.setMathMarks(studentmarks.getMathMarks());
		sm.setChemMarks(studentmarks.getChemMarks());
		sm.setCsMarks(studentmarks.getCsMarks());
        sm.setTotal(utot);
        sm.setPercentage(uper);
		smrepo.save(sm);
		
		return sm;
	}

	@Override
	// get student details by their first name using student repository object
	public Student getStudentByName(String fname) {
		
		return sturepo.getStudentByName(fname);
	}

	@Override
	// get studentmark details by their name using studentmarks repository object
	public StudentMarks getStudentMarksByName(String name) {
		
		return smrepo.getStudentMarksByName(name);
	}
	

}
