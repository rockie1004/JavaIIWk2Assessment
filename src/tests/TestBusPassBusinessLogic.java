//tests the BusPassBusinessLogic class methods
package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import model.BusPassBusinessLogic;
import model.Passenger;
import model.BusPass;

@RunWith(Suite.class)
@SuiteClasses({ IsEligibleTest.class, CalculateSaleTest.class })
public class TestBusPassBusinessLogic {
}
