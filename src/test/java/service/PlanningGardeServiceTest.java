package service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import jdk.nashorn.internal.ir.annotations.Ignore;
import model.Doctor;
import model.ImpossibleToPlan;
import model.PlanningGarde;

import org.junit.Test;

import service.PlanningGardeService;

public class PlanningGardeServiceTest {

	/*
	@Ignore
	@Test(expected = ImpossibleToPlan.class)
	public void test_generatePlanningGarde_CaseZeroDoctorAndOneDayPeriod() throws ImpossibleToPlan {
		//Init input
		
		//Call method under test
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		Date startdate = new Date();
		Date enddate = new Date();
		
		PlanningGarde planningGarde = new PlanningGardeService().generatePlanningGarde(doctors, startdate, enddate);
		
		// Assertion
	}
	
	@Ignore
	@Test
	public void test_generatePlanningGarde_CaseOneDoctorAndOneDayPeriod() throws ImpossibleToPlan {
		//Init input
		
		//Call method under test
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		doctors.add(new Doctor("Mohamed", null));
		Date startdate = new Date();
		Date enddate = new Date();
		
		PlanningGarde planningGarde = new PlanningGardeService().generatePlanningGarde(doctors, startdate, enddate);
		
		// Assertion
		assertEquals(1, planningGarde.getPlanning().size());
		//assertEquals("Mohamed", planningGarde.getPlanning().get(new Date()).getName());
	}
	*/
	

}
