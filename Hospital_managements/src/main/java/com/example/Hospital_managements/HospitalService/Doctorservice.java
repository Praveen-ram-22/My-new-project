package com.example.Hospital_managements.HospitalService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital_managements.Entitys.Doctor;
import com.example.Hospital_managements.Repository.DoctorRepo;
@Service
public class Doctorservice {

	@Autowired 
	private DoctorRepo DRepo;
	
	public List<Doctor> FindallDoctor()
	{
		return DRepo.findAll();	
	}
	
	public Doctor SaveDoctor(Doctor doctor)
	
	{  
		return DRepo.save(doctor);
	}
	
   public Doctor updateDoctor(Doctor doctor)
	
	{
		return DRepo.save(doctor);
	}
    public void DeleteByID(int id)
    {
    	DRepo.deleteById(id);
    }

	    
	
}
