package service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;

import model.Doctor;
import model.ImpossibleToPlan;
import model.PlanningGarde;

import org.junit.Ignore;
import org.junit.Test;

public class PlanningGardeServiceTest {

	@Ignore
	@Test(expected = ImpossibleToPlan.class)
	public void test_generatePlanningGarde_CaseZeroDoctorAndOneDayPeriod() throws ImpossibleToPlan {
		// Init input
		ArrayList<Doctor> listdoctors = null;
		Date startdate1 = new Date();
		Date enddate1 = new Date();
		PlanningGarde planningGarde1 = new PlanningGardeService().generatePlanningGarde(listdoctors, startdate1, enddate1);
		// Call method under test
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		Date startdate = new Date();
		Date enddate = new Date();

		PlanningGarde planningGarde = new PlanningGardeService().generatePlanningGarde(doctors, startdate, enddate);

		// Assertion
		assertTrue(planningGarde1 == planningGarde);
	}

	@Ignore
	@Test
	public void test_generatePlanningGarde_CaseOneDoctorAndOneDayPeriod() throws ImpossibleToPlan {
		// Init input

		// Call method under test
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		doctors.add(new Doctor("Mohamed", "Tounsi", "11111", null, null));
		Date startdate = new Date();
		Date enddate = new Date();

		PlanningGarde planningGarde = new PlanningGardeService().generatePlanningGarde(doctors, startdate, enddate);

		// Assertion
		assertEquals("Mohamed", planningGarde.getPlanning().get(startdate).getName());
	}

	@Test
	public void test_generatePlanningGarde_CaseOneDoctorAndOneDay() throws ImpossibleToPlan {
		// Init input
		Date dp1 = new Date(2015, 04, 20);
		Date dp2 = new Date(2015, 05, 15);
		Date dv1 = new Date(2015, 05, 05);
		Date dv2 = new Date(2015, 05, 18);
		ArrayList<Date> preferences = new ArrayList<Date>();
		ArrayList<Date> vacances = new ArrayList<Date>();
		preferences.add(dp1);
		preferences.add(dp2);
		vacances.add(dv1);
		vacances.add(dv2);
		Date startdate = new Date();
		Date enddate = new Date();
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		PlanningGarde planningGarde = new PlanningGardeService().generatePlanningGarde(doctors, startdate, enddate);

		doctors.add(new Doctor("Mohamed", "Tounsi", "11111", preferences, vacances));
		Date test = new Date(2015, 05, 10);
		assertEquals(test, planningGarde.getPlanning().get(preferences.get(0)));
		// Call method under test

	}

}
