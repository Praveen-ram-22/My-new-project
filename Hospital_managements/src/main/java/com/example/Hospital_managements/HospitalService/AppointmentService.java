package com.example.Hospital_managements.HospitalService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

import com.example.Hospital_managements.Entitys.Appointment;
import com.example.Hospital_managements.Repository.AppointmentRepo;

@Service
public class AppointmentService {

	@Autowired 
	private AppointmentRepo ARepo;
	
	public  List<Appointment> FindallAppointment()
	{
		return ARepo.findAll();	
	}
	
	public Appointment SaveAppointment(Appointment appointment)
	
	{
		return ARepo.save(appointment);
	}
	
   public Appointment updateAppointment(Appointment appointment)
	
	{
		return ARepo.save(appointment);
	}
    public void DeleteByID(int id)
    {
    	ARepo.deleteById(id);
    }
   
}
