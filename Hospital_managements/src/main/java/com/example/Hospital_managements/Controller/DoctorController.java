package com.example.Hospital_managements.Controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Hospital_managements.Entitys.Doctor;
import com.example.Hospital_managements.HospitalService.Doctorservice;
import com.example.Hospital_managements.Repository.DoctorRepo;

@Controller
public class DoctorController {

	@Autowired
	private Doctorservice DService;
	
	@Autowired
	private DoctorRepo Drepo;
	
	@RequestMapping("/Doctor")
	public String DoctorForm()
	{
		return "AddDoctors";
		
	}
	@PostMapping("/Doctors")
	public String SaveDoctor(@ModelAttribute("doctor") Doctor doctor)
	{ 
		  DService.SaveDoctor(doctor);
		return "Home";
	}
	
	 @GetMapping("/editDoctor/{id}")
	    public String showEditForm(@PathVariable("id") int id, Model model) {
	        @SuppressWarnings("deprecation")
			Doctor doctor = Drepo.getById(id);
	        
	        model.addAttribute("doctor", doctor);
	        return "editDoctor";
	    }

	    // Process the form submission for editing a Doctor
	 @PostMapping("/EditDoctor")
	    public String saveDoctor(@ModelAttribute("doctor") Doctor doctor) {
		 DService.SaveDoctor(doctor);

	        return "redirect:/showdetails";
	    }
	
	@RequestMapping("/Doctors/{id}")
	public String  DeleteById(@PathVariable int id)
	{
		DService.DeleteByID(id);
		
		return "redirect:/showdetails";
	}
	 	
	 	
	@RequestMapping("/showdetails")
		public String showdetails(Model model)
		{
			List<Doctor> listDoctors=Drepo.findAll();
			model.addAttribute("listDoctors", listDoctors);
			return "viewDoctor";
		}

	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	
}
