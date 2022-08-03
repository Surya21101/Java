package com.ServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Exception.UserNotFoundException;
import com.Model.User;
import com.Repository.UserRepository;
import com.Service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
    @Autowired
	UserRepository userrepo;
	
	@Override
	public User saveUser(User user) {
		
		return userrepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		//getting user by id,if not present throw custom exception
		return userrepo.findAll();
	}

	@Override
	public User getUserById(int id) {
		
		return userrepo.findById(id).orElseThrow(()-> new UserNotFoundException("Entered user id not present in table"));
	}

	@Override
	public void deleteUserById(int id) {
		userrepo.findById(id).orElseThrow(()-> new UserNotFoundException("Entered user id not present in table"));
		userrepo.deleteById(id);
	}

	@Override
	public User updateUserById(User user, int id) {
		User existinguser = userrepo.findById(id).orElseThrow(()-> new UserNotFoundException("Entered user id not present in table"));
			
		existinguser.setUserName(user.getUserName());
		existinguser.setUserEmail(user.getUserEmail());
		existinguser.setUserPhone(user.getUserPhone());
		
		userrepo.save(existinguser);		
		return existinguser;
	}

}
