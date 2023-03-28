package com.example.Hospital_managements.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Hospital_managements.Entitys.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer>{

}
