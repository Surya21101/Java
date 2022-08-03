package com.Service;

import java.util.List;
import com.Model.User;

public interface UserService {
	
User saveUser(User user);  //save user details

List<User> getAllUsers(); //fetching all user details

User getUserById(int id); //fetching user details based on id

void deleteUserById(int id); //delete user details based on id

User updateUserById(User user,int id); //change user details based on id

}
