package dao;

import java.util.ArrayList;
import java.util.List;

import model.Doctor;

public class Gestion {
	List<Doctor> lst;

	public Gestion() {
		lst = new ArrayList<Doctor>();
	}

	public void ajouteDoctor(Doctor d) {
		lst.add(d);
	}
}
