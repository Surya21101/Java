package com.Controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Model.User;
import com.Service.UserService;

@RestController
public class UserController {
	
@Autowired
private UserService userservice;

@PostMapping("/api/saveuser")
public ResponseEntity<User> saveUser(@Valid @RequestBody User user) {
	return new ResponseEntity<User>(userservice.saveUser(user),HttpStatus.CREATED);
	
}
@GetMapping("/api/getAllUsers")
public List<User> getAllUsers(){
	return userservice.getAllUsers();
	
}
@GetMapping("/api/getUserById/{id}")
public ResponseEntity<User> getUserById(@PathVariable("id") int id) {
	return new ResponseEntity<User>(userservice.getUserById(id),HttpStatus.OK);
	
}
@PutMapping("/api/updateUserById/{id}")
public ResponseEntity<User> updateUserById(@Valid @PathVariable("id") int id,@RequestBody User user){
	return new ResponseEntity<User>(userservice.updateUserById(user, id),HttpStatus.OK);
	
}
@DeleteMapping("/api/deleteUserById/{id}")
public ResponseEntity<String> deleteUserById(@PathVariable("id") int id) {
	
	userservice.deleteUserById(id);
	return new ResponseEntity<String>("User details deleted successfully",HttpStatus.OK);
}

}
