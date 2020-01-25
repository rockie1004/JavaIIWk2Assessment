package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.BusPassBusinessLogic;
import model.Passenger;
import model.BusPass;

public class TestBusPassBusinessLogic {

	BusPassBusinessLogic bpLogic = new BusPassBusinessLogic();
	BusPass day = new BusPass("day","Smartphone", 4.00 , false , false);
	BusPass dayRF = new BusPass("dayRF","Smartphone", 2.00 , true , false);
	BusPass ridePara = new BusPass("ridePara","Smartphone", 3.50 , false, true);

	Passenger passengerNone = new Passenger("01",false,false);
	Passenger passengerRF = new Passenger("02",true, false);
	Passenger passengerPara = new Passenger("03", false,true);

	@Before
	public void setUp() throws Exception {}

	@Test
	public void testIsEligibleNoRestrictions_Eligible() {
		//anyone can buy a day pass that has no eligibility requirement		
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
	public void testIsEligibleParaRestriction_NotEligible() {
		//test will fail if there is a problem with the para if statement in the isEligible method
		assertFalse(bpLogic.isEligible(ridePara, passengerNone));
		assertFalse(bpLogic.isEligible(ridePara, passengerRF));
	}
	
	@Test
	public void testCalculateSale() {
		double sale = bpLogic.calculateSale(day,2);
		assertEquals(8, sale, 0.0);
	}


}
