package com.springboot.shopkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.shopkart.model.LoginModel;
import com.springboot.shopkart.model.UserModel;
import com.springboot.shopkart.repo.UserRepo;


@RestController
@RequestMapping("/all")
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	
	@PostMapping("/signup")
	public UserModel addUser(@RequestBody UserModel userModel) {
		return userRepo.save(userModel);
	}
	
	@GetMapping("/viewUser")
	public List<UserModel> viewUser() {
		return userRepo.findAll();
	}
	
	@PostMapping("/login")
	public String viewDetails(@RequestBody  LoginModel loginModel) {
		String name=loginModel.getUserNmae();
		String pswd=loginModel.getPassword();
		Long myId=loginModel.getUserId();
		UserModel result=userRepo.getById(myId);
		String userName=result.getUserNmae();
		String pass=result.getPassword();
		
		if(name.equals(userName) && pswd.equals(pass)){
			return "Login succesful"
;		}
		else {
			return "Invalid username and password";
		}
		
	
	

}
}
