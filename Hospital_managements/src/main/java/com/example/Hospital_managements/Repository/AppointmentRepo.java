package com.example.Hospital_managements.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospital_managements.Entitys.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}
