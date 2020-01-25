package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.BusPass;
import model.BusPassBusinessLogic;
import model.Passenger;

public class IsEligibleTest {

	BusPassBusinessLogic bpLogic = new BusPassBusinessLogic();
	BusPass day;
	BusPass dayRF ;
	BusPass ridePara;

	Passenger passengerNone ;
	Passenger passengerRF;
	Passenger passengerPara ;

	@Before
	//setup, ensures all tests are using these parameters
	public void setUp() throws Exception {
		 day = new BusPass("day","Smartphone", 4.00 , false , false);
		 dayRF = new BusPass("dayRF","Smartphone", 2.00 , true , false);
		 ridePara = new BusPass("ridePara","Smartphone", 3.50 , false, true);

		 passengerNone = new Passenger("01",false,false);
		 passengerRF = new Passenger("02",true, false);
		 passengerPara = new Passenger("03", false,true);

	}
	//https://examples.javacodegeeks.com/core-java/junit/junit-setup-teardown-example/
	@After
	public void teardown() throws Exception {
		day=null;
		  dayRF=null;
		  ridePara=null;
		  passengerNone=null; 
		  passengerRF=null;
		  passengerPara=null;
	}
	@Test
	public void testIsEligibleNoRestrictions_Eligible() {
		//any passenger can buy a day pass that has no eligibility requirement		
		assertTrue(bpLogic.isEligible(day, passengerNone));
		assertTrue(bpLogic.isEligible(day, passengerRF));
		assertTrue(bpLogic.isEligible(day, passengerPara));
	}

	@Test
	public void testIsEligibleRFRestriction_NotEligible() {
		//test will fail if there is a problem with the RF if statement in the isEligible method
		assertFalse(bpLogic.isEligible(dayRF, passengerNone));
		assertFalse(bpLogic.isEligible(dayRF, passengerPara));
	}
	
	@Test
	public void testIsEligibleRFRestriction_Eligible() {
		//test will fail if there is a problem with the RF if statement in the isEligible method
		assertTrue(bpLogic.isEligible(dayRF, passengerRF));
	}
	@Test
	public void testIsEligibleParaRestriction_Eligible() {
		//test will fail if there is a problem with the para if statement in the isEligible method
		assertTrue(bpLogic.isEligible(ridePara, passengerPara));
	}
	@Test
	public void testIsEligibleParaRestriction_NotEligible() {
		//test will fail if there is a problem with the para if statement in the isEligible method
		assertFalse(bpLogic.isEligible(ridePara, passengerNone));
		assertFalse(bpLogic.isEligible(ridePara, passengerRF));
	}
}
