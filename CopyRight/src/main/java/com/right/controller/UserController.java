package com.right.controller;

import java.net.http.HttpRequest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.resource.HttpResource;

import com.right.entity.User;
import com.right.service.UserService;

import jakarta.jws.soap.SOAPBinding.Use;

@Controller
@RequestMapping("/Users")
public class UserController {
	
	@Autowired
	private UserService usrService;
	
	@PostMapping("/createUser")
	public ResponseEntity<User>  createUser(@RequestBody User user){
		User create = usrService.createUser(user);
		return new ResponseEntity<>(create,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getUserId/{id}")
	public ResponseEntity<User> getUserId(@PathVariable("id") Long id){
		User getId = usrService.getUserId(id);
		return new ResponseEntity<>(getId, HttpStatus.OK);
		
	}
	
	@GetMapping("/getAllUser")
	public ResponseEntity<List<User>>  getAllUsers(){
		List<User> allUser = usrService.getAllUsers();
		return new ResponseEntity<>(allUser , HttpStatus.OK);
		
	}
	
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user){
		user.setId(id);
		User up = usrService.updateUser(user);
		return new ResponseEntity<>(up, HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") long id){
		usrService.deleteUser(id);
		return new ResponseEntity<>("User is deleted", HttpStatus.OK) ;
		
	}

}
