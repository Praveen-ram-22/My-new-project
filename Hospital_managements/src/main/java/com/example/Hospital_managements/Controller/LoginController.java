package com.example.Hospital_managements.Controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Hospital_managements.Entitys.Login;
import com.example.Hospital_managements.HospitalService.LoginService;
import com.example.Hospital_managements.Repository.LoginRepo;
@Controller
public class LoginController {

	@Autowired
	private LoginService Lservice;
	
	@Autowired
	private LoginRepo loginRepo;
	
	@GetMapping("/logins")
	public String Showlogin()
	{
		return "Loginpage";
		
	}
	@GetMapping("/Homes")
	public String ShowLogin()
	{
		return "Home";
		
	}
	@GetMapping("/CreateAccount")
	public String Createlogin()
	{
		return "CreateLogin";
		
	}
	@GetMapping("/forgetPassword")
	public String login()
	{
		return "Change_Password";
		
	}
	
	@PostMapping("/Create")
	public String saveReg(@ModelAttribute("login")   Login login) {
		loginRepo.save(login);
		return "Loginpage";    
	}
	
	@GetMapping("/editLogin/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        @SuppressWarnings("deprecation")
        Login login= loginRepo.getById(id);
        
        model.addAttribute("login", login);
        return "Change_Password";
    }

    // Process the form submission for editing a Doctor
 @PostMapping("/EditLogin")
    public String saveLogin(@ModelAttribute("Login") Login login) 
    {
    Lservice.SaveLogin(login);

        return "Loginpage";
    }
	
	@RequestMapping("/verifylogin")
	public String verifyLogin(@RequestParam(name = "username", required = false) String username, @RequestParam(name = "password", required = false) String password, ModelMap modelMap ) {
		Login login =loginRepo.verifyuser( username, password);
		if(login!=null) {
		if(login.getUsername().equals(username) && login.getPassword().equals(password)) {
			return "Home";
		}else {
			modelMap.addAttribute("error", "invalid username / password");
			return "Loginpage";
		}
		}else {
			modelMap.addAttribute("error", "invalid username / password");
			return "Loginpage";
		}
		
	}
	
}
