package com.example.Hospital_managements.Entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Doctors")
public class Doctor {
	
	public Doctor() {
		super();
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="ID")
	private int id;
@Column(name="DOCTOR_NAME")
  private String Dname;
@Column(name="CONTACT_NUMBER")
private long number;
@Column(name="SPECILIZATION")
 private String Specilization;
  
 
public Doctor(int id, String dname, long number, String specilization) {
	super();
	this.id = id;
	Dname = dname;
	this.number = number;
	Specilization = specilization;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDname() {
	return Dname;
}
public void setDname(String dname) {
	Dname = dname;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
 public String getSpecilization() {
	return Specilization;
}
public void setSpecilization(String specilization) {
	Specilization = specilization;
}
@Override
public String toString() {
	return "Doctor [id=" + id + ", Dname=" + Dname + ", number=" + number + ", Specilization=" + Specilization + "]";
}

 
}
