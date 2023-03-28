package com.example.Hospital_managements.HospitalService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital_managements.Entitys.Patient;
import com.example.Hospital_managements.Repository.PatientRepo;

@Service
public class PatientService {

	@Autowired 
	private PatientRepo PRepo;
	
	public List<Patient> FindallPatient()
	{ 
		return PRepo.findAll();	
	}
	
	public Patient SavePatient(Patient patient)
	
	{
		return PRepo.save(patient);
	}
	
   public Patient updatepatient(Patient patient)
	
	{
		return PRepo.save(patient);
	}
    public void DeleteByID(int id)
    {
    	PRepo.deleteById(id);
    }

}
