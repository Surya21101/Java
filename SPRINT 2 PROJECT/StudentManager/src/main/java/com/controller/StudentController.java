package com.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.Student;
import com.model.StudentMarks;
import com.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	

    @Autowired
	private StudentService studentservice;
    
    
    
  //--------------------------REQUEST HANDLING STUDENT DETAILS--------------------------//
	
    
    
    //request to add student details using postman 
    @CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/add")
	public ResponseEntity<Student> saveStudent( @Valid @RequestBody Student student){
		return new ResponseEntity<Student>(studentservice.saveStudent(student),HttpStatus.CREATED);	
		
	}
	
	//request to getall student details using postman
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getall")
	public List<Student> getAllStudents(){
		return studentservice.getAllStudents();
		
	}
	
	//request to get student details by their id using postman
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int id) {
		return new ResponseEntity<Student>(studentservice.getStudentById(id),HttpStatus.OK);
		
	}
	
	//request to update student details by their id using postman
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/updatebyid/{id}")
	public ResponseEntity<Student> updateStudentById(@Valid @PathVariable("id") int id,@RequestBody Student student){
		return new ResponseEntity<Student>(studentservice.updateStudentById(student,id),HttpStatus.OK);
		
	}
	
	//request to delete student details by their id using postman
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<String> deleteStudentById(@PathVariable("id") int id) {
		
		studentservice.deleteStudentById(id);
		return new ResponseEntity<String>("Student details of " + id + " has been deleted successfully",HttpStatus.OK);
	}
	
	//request to get student details by their first name using postman
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getstudentbyname/{fname}")
	public Student getStudentByName(@PathVariable String fname){
		
		return studentservice.getStudentByName(fname);
	}
	
	//request to get student details by their email using postman
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getstudentbyemail/{email}")
	public Student getStudentByEmail(@PathVariable String email) {
		
		return studentservice.getStudentByEmail(email);
	}
	
	//request to get student details by their phone number using postman
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getstudentbyphone/{phone}")
	public Student getStudentByPhone(@PathVariable long phone) {
		
		return studentservice.getStudentByPhone(phone);
	}
	
	
	
	//--------------------------REQUEST HANDLING STUDENT MARKS--------------------------//
	
	
	
	//request to add studentmark details using postman
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/marks/add")
	public ResponseEntity<StudentMarks> saveStudentMarks( @Valid @RequestBody StudentMarks studentmarks){
		return new ResponseEntity<StudentMarks>(studentservice.saveStudentMarks(studentmarks),HttpStatus.CREATED);	
		
	}
	
	//request to getall studentmark details using postman
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/marks/getall")
	public List<StudentMarks> getAllStudentsMarks(){
		return studentservice.getAllStudentsMarks();
		
	}
	
	//request to get studentmark details by their id using postman
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/marks/getbyid/{mid}")
	public ResponseEntity<StudentMarks> getStudentMarksById(@PathVariable("mid") int mid) {
		return new ResponseEntity<StudentMarks>(studentservice.getStudentMarksById(mid),HttpStatus.OK);
		
	}
	
	//request to update studentmark details by their id using postman
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/marks/updatebyid/{mid}")
	public ResponseEntity<StudentMarks> updateStudentMarksById(@Valid @PathVariable("mid") int mid,@RequestBody StudentMarks studentmarks){
		return new ResponseEntity<StudentMarks>(studentservice.updateStudentMarksById(studentmarks,mid),HttpStatus.OK);
		
	}
	
	//request to delete studentmark details by their id using postman
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/marks/deletebyid/{mid}")
	public ResponseEntity<String> deleteStudentMarksById(@PathVariable("mid") int mid) {
		
		studentservice.deleteStudentById(mid);
		return new ResponseEntity<String>("Student Marks of " + mid + " has been deleted successfully",HttpStatus.OK);
	}
	
	//request to get studentmark details by their name using postman
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getstudentmarksbyname/{name}")
	public StudentMarks getStudentMarksByName(@PathVariable String name){
		
		return studentservice.getStudentMarksByName(name);
	}
	
	
	
}
