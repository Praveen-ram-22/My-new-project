package com.example.Hospital_managements.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospital_managements.Entitys.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer>{
      
}
