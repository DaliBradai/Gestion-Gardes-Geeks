package model;

import java.util.Date;
import java.util.Map;

public class PlanningGarde 
{

	// Let attributs
	private Map<Date,Doctor> planning;

	// Constructeurs
	public PlanningGarde(Map<Date, Doctor> planning) {
		super();
		this.planning = planning;
	}
	// Getters & Setters
	public Map<Date, Doctor> getPlanning() {
		return planning;
	}
	public void setPlanning(Map<Date, Doctor> planning) {
		this.planning = planning;
	}
}
