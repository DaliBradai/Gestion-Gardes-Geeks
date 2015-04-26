package dao;

import java.util.ArrayList;
import java.util.List;

import model.Doctor;
//this class allow as ti manage our doctor
public class Gestion {
	//list of Doctors
	List<Doctor> lst;
	//this is our constructer
	public Gestion() {
		lst = new ArrayList<Doctor>();
	}
	//this methode allow as to add a new doctor to the list of doctors
	public void ajouteDoctor(Doctor d) {
		lst.add(d);
	}
}
