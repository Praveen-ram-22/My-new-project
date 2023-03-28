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

import com.example.Hospital_managements.Entitys.Patient;
import com.example.Hospital_managements.HospitalService.PatientService;
import com.example.Hospital_managements.Repository.PatientRepo;


@Controller
public class PatientController {

	@Autowired
	private PatientService PService;
	@Autowired
	private PatientRepo psrepo;
	
	@RequestMapping("/Patient")
	public String PatientForm()
	{
		return "Addpatient";
		
	}
  
	
	@PostMapping("/Patients")
	public String SaveDoctor(@ModelAttribute("patient") Patient patient)
	{ 
		PService.SavePatient(patient);
		return "Home";
	}
	@GetMapping("/editPatient/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        @SuppressWarnings("deprecation")
		Patient  patient = psrepo.getById(id);
        
        model.addAttribute("patient", patient);
        return "editpatient";
    }

    // Process the form submission for editing a Doctor
 @PostMapping("/EditPatient")
    public String saveDoctor(@ModelAttribute("patient") Patient patient) {
	 PService.SavePatient(patient);

        return "redirect:/showPatient";
    }

@RequestMapping("/Patient/{id}")
public String  DeleteById(@PathVariable int id)
{
	PService.DeleteByID(id);
	
	return "redirect:/showPatient";
}

@RequestMapping("/showPatient")
public String showdetails(Model model)
{
	List<Patient> listPatient=psrepo.findAll();
	model.addAttribute("listPatient", listPatient);
	return "viewPatient";
}






}
