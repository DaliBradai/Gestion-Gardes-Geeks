package model;

import java.util.Date;
import java.util.List;

public class Doctor 
{
	// Les attributs
	private String name;
	private String lastname ;
	private String cin ;
	private String photo ;
	private List<Date> holidays;
	private List<Date> preferences;
    
	public Doctor(String name, String lastname, String cin, List<Date> holidays,List<Date> preferences) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.cin = cin;
		this.holidays = holidays;
		this.setPreferences(preferences);
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public List<Date> getPreferences() {
		return preferences;
	}
	public void setPreferences(List<Date> preferences) {
		this.preferences = preferences;
	}
	
}
