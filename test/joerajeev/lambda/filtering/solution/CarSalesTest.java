package joerajeev.lambda.filtering.solution;

import joerajeev.lambda.entities.Car.Transmission;
import joerajeev.lambda.filtering.solution.CarSales;
import joerajeev.lambda.util.TestUtil;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the joerajeev.lambda.solution.java8.CarSales application
 * Demonstrates the use of lambda expressions
 * 
 * @author Rajeev
 *
 */
public class CarSalesTest {

	CarSales app = new CarSales();
	
	@Before
	public void setUp() throws Exception {
		app.setAllCars(TestUtil.getTestCars());
	}

	@Test
	public void test() {
		System.out.println("Cars made after 2008");
		app.showFilteredCars(c -> c.getYear() > 2008);
		System.out.println("\n");
		
		System.out.println("Cars made after 2008 AND are manual transmission");
		app.showFilteredCars( c ->  c.getYear() > 2008 && c.getTransmision().equals(Transmission.MANUAL));
		System.out.println("\n");
	}

	
}
