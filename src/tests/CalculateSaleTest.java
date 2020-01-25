package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BusPass;
import model.BusPassBusinessLogic;

public class CalculateSaleTest {
	BusPassBusinessLogic bpLogic = new BusPassBusinessLogic();
	BusPass day;
	
	@Before
	//setup, ensures all tests are using these parameters
	public void setUp() throws Exception {
		 day = new BusPass("day","Smartphone", 4.00 , false , false);
	}
	
	@Test
	public void testCalculateSale() {
		double sale = bpLogic.calculateSale(day,2);
		assertEquals(8, sale, 0.0);
	}
}
