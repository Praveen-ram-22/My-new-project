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

import com.example.Hospital_managements.Entitys.Appointment;
import com.example.Hospital_managements.HospitalService.AppointmentService;
import com.example.Hospital_managements.Repository.AppointmentRepo;

@Controller
public class AppointmentController {

	@Autowired
	private AppointmentService AService;
	@Autowired
	private AppointmentRepo Arepo;
	
	@RequestMapping("/Appointment")
	public String PatientForm()
	{
		return "Addappointment";
		
	}	@PostMapping("/Appointments")
	public String SaveAppointment(@ModelAttribute("Appointment") Appointment appointment)
	{ 
		AService.SaveAppointment(appointment);
		return "Home";
	}
	
	
	 @GetMapping("/editAppointment/{id}")
	    public String showEditForm(@PathVariable("id") int id, Model model) {
	        @SuppressWarnings("deprecation")
	        Appointment appointment = Arepo.getById(id);
	        
	        model.addAttribute("appointment", appointment);
	        return "editAppointment";
	    }

	    // Process the form submission for editing a Doctor
	 @PostMapping("/EditAppointment")
	    public String saveAppointment(@ModelAttribute("doctor") Appointment appointment) {
		 AService.SaveAppointment(appointment);

	        return "redirect:/showAppointment";
	    }
	
	@RequestMapping("/Appointment/{id}")
	public String  DeleteById(@PathVariable int id)
	{
		AService.DeleteByID(id);
		
		return "redirect:/showAppointment";
	}
	 	
	
	
	
	@RequestMapping("/showAppointment")
	public String showdetails(Model model)
	{
		List<Appointment> listAppointment=Arepo.findAll();
		model.addAttribute("listAppointment", listAppointment);
		return "viewAppointment";
	}
	


	
	
	
	
	
}
