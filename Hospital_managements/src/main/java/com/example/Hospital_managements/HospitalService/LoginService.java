package com.example.Hospital_managements.HospitalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital_managements.Entitys.Login;
import com.example.Hospital_managements.Repository.LoginRepo;
@Service
public class LoginService {

	@Autowired
	private LoginRepo LRepo;
	
	public Login SaveLogin(Login login)
	
	{  
		return LRepo.save(login); 
	}
	
   public Login updateLogin(Login login)
	
	{
		return LRepo.save(login);
	}
   
   public Login verifyLogin(String username,String password) {  
		return LRepo.verifyuser( username ,password);   
	       }
   
}
