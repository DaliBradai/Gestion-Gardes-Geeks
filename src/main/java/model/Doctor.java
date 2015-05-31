package model;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Doctor 
{

	private String name;
	private String lastname ;
	private String cin ;
	//private String photo ;
	private  int tel1 ;
	private  int tel2 ;
	private String email ;
	private String adresse ;
	private String status;
	
	private List<Date> holidays;
	private List<Integer> preferences;
    
	public Doctor(String name, String lastname, String cin,int tel1,int tel2,String email, String adresse,List<Date> holidays,List<Integer> preferences,String status) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.cin = cin;
		this.tel1=tel1 ;
		this.tel2=tel2 ;
		this.email=email ;
		this.status=status ;
		this.adresse=adresse ;
		this.holidays = holidays;
		this.preferences=preferences;
	}
	public int getTel1() {
		return tel1;
	}
	public void setTel1(int tel1) {
		this.tel1 = tel1;
	}
	public int getTel2() {
		return tel2;
	}
	public void setTel2(int tel2) {
		this.tel2 = tel2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	// Getters & Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Date> getHolidays() {
		return holidays;
	}
	public void setHolidays(List<Date> holidays) {
		this.holidays = holidays;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}



	public List<Integer> getPreferences() {
		return preferences;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setPreferences(List<Integer> preferences) {
		this.preferences = preferences;
	}
	
}
