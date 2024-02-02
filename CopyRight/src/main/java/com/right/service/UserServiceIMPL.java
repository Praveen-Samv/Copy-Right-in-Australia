package com.right.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.right.entity.User;
import com.right.repository.UserRepository;


@Service
public class UserServiceIMPL implements UserService{
	
	
	@Autowired 
	private UserRepository usrRepository;

	@Override
	public User createUser(User user) {
		return usrRepository.save(user);
	}

	
	@Override
	public User getUserId(Long id) {
		Optional<User> opt = usrRepository.findById(id);
		return opt.get();
	}

	@Override
	public List<User> getAllUsers() {
		return usrRepository.findAll();
	}

	@Override
	public User updateUser(User user) {
		User update = usrRepository.findById(user.getId()).get();
		update.setUserName(user.getUserName());
		update.setFirstName(user.getFirstName());
		update.setLastName(user.getLastName());
		update.setEmail(user.getEmail());
		
		User dated = usrRepository.save(update);
		return dated;
	}

	@Override
	public void deleteUser(Long id) {
		usrRepository.deleteById(id);
	}

}
