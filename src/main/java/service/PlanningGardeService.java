package service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Doctor;
import model.ImpossibleToPlan;
import model.PlanningGarde;

public class PlanningGardeService 
{
	public PlanningGarde generatePlanningGarde(List<Doctor> doctors, Date startdate , Date enddate)throws ImpossibleToPlan
	{
		//result to be returned
		Map<Date,Doctor> planning = new HashMap<Date, Doctor>();
		PlanningGarde planninggarde = new PlanningGarde(planning);
		if (doctors.isEmpty())
		{
			throw new ImpossibleToPlan();
		}
		
		if (doctors.size()==1)
		{
			planning.put(startdate, doctors.get(0));
		}
		
		
		return planninggarde;
	}
}
