package com.example.Hospital_managements.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Hospital_managements.Entitys.Users;
import com.example.Hospital_managements.Repository.userRepo;

@Controller
public class UserController {

	@Autowired
	private userRepo UserRP;
	
	@PostMapping("/user")
	public Users User(@RequestBody Users u) {
	
		return UserRP.save(u);
	}
	
}
