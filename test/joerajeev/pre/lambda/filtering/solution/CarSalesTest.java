package joerajeev.pre.lambda.filtering.solution;

import joerajeev.lambda.entities.Car;
import joerajeev.lambda.entities.Car.Transmission;
import joerajeev.lambda.util.TestUtil;
import joerajeev.pre.lambda.filtering.solution.CarPredicate;
import joerajeev.pre.lambda.filtering.solution.CarSales;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the joerajeev.pre.lambda.filtering.solution.CarSales application
 * Demonstrates the power of behaviour parameterization using functional interfaces
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
		System.out.println("Cars in no more than 5 years old");
		app.showFilteredCars(new CarPredicate(){
			public boolean test(Car car){
				return car.getYear() > 2008;
			}
		});
		System.out.println("\n");
		
		System.out.println("Cars that are no more than 5 years old AND are manual");
		app.showFilteredCars(new CarPredicate(){
			public boolean test(Car car){
				return car.getYear() > 2008 && car.getTransmision().equals(Transmission.MANUAL);
			}
		});
		System.out.println("\n");
	}
	
}
