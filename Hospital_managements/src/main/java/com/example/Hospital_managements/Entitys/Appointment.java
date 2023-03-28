package com.example.Hospital_managements.Entitys;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="APPOINTMENT")
public class Appointment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="DOCTOR_NAME")
	  private String Dname;
	@Column(name="PATIENT_NAME")
       private String pname;
    
    private String  DateTime;
    
    
	public Appointment() {
		super();
	}


	public Appointment(int id, String dname, String pname, String dateTime) {
		super();
		this.id = id;
		Dname = dname;
		this.pname = pname;
		DateTime = dateTime;
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


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getDateTime() {
		return DateTime;
	}


	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}


	@Override
	public String toString() {
		return "Appointment [id=" + id + ", Dname=" + Dname + ", pname=" + pname + ", DateTime=" + DateTime + "]";
	}
	
	 	
	
}
