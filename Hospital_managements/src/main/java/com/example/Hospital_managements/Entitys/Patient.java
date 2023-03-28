package com.example.Hospital_managements.Entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PATIENTS")
public class Patient {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="P_ID")
	private int id;
 @Column(name="PATIENT_NAME")
	private String pname;
 @Column(name="GENDER")
private String Gender;
 @Column(name="CONTACT_NUMBER")
	private long number;
 @Column(name="PATIENT_ADDRESS")
private String address;
	
	
	
	public Patient() {
		super();
	}
	
	public Patient(int id, String pname, String gender, long number, String address) {
		super();
		this.id = id;
		this.pname = pname;
		Gender = gender;
		this.number = number;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", pname=" + pname + ", Gender=" + Gender + ", number=" + number + ", address="
				+ address + "]";
	}
	
	
}
