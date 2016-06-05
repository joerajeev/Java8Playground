package joerajeev.lambda.filtering.solution;

import joerajeev.entities.Car;
import joerajeev.entities.Car.Transmission;
import joerajeev.lambda.filtering.solution.CarSales;
import joerajeev.lambda.util.TestUtil;
import joerajeev.pre.lambda.filtering.solution.CarPredicate;

import org.junit.Before;
import org.junit.Test;

/**
 * NOT A REAL TEST.
 * Demonstrates the use of lambda expressions by consuming
 * the joerajeev.lambda.solution.java8.CarSales application
 * Also demonstrates how the same was achieved before Java 8.
 * 
 * @author Joseph
 *
 */
public class CarSalesConsumer {

	@Test
	public void showFilteredCarsUsingJava8LambdaExpressions() {
		System.out.println("Filtered cars using Lambda expression: ");
		CarSales app = new CarSales();
		app.setAllCars(TestUtil.getTestCars());
		System.out.println("Cars made after 2008");
		app.showFilteredCars(c -> c.getYear() > 2008);
		System.out.println("\n");
		
		System.out.println("Cars made after 2008 AND are manual transmission");
		app.showFilteredCars( c ->  c.getYear() > 2008 && c.getTransmision().equals(Transmission.MANUAL));
		System.out.println("=============================");
		System.out.println("\n");

	}
	
	
	@Test
	public void demoFilterAPIsInCarSalesThatDontSupportFunctionalInterfaces() {
		System.out.println("Filtered cars using filter API's (pre JAVA 8)");
		joerajeev.pre.lambda.filtering.problem.CarSales app = new joerajeev.pre.lambda.filtering.problem.CarSales();
		app.setAllCars(TestUtil.getTestCars());
		System.out.println("Cars between 2005 and 2010");
		app.showCarsFilterByYearRange(2005, 2010);
		System.out.println("\n");
		
		//What about year with no upper limit? Need to use a special value and update the methord to support it..
		System.out.println("Cars in no more than 5 years old");
		app.showCarsFilterByYearRange(2008, null);	//These 'special case' solutions  add complexity and potentionally introduce errors
		System.out.println("\n");
		
		//What about selecting by KMs? need another method...
		System.out.println("Cars done between 50000 and 100000 kms");
		app.showCarsFilterByKMRange(50000, 100000);
		System.out.println("=============================");
		System.out.println("\n");
		
		//What about selecting by Price, Transmission or other params?  need even more methods!
		

	}
	
	@Test
	public void showFilteredCarsUsingPreJava8FunctionalInterfaces() {
		System.out.println("Filtered cars using functional interfaces (pre JAVA 8)");
		joerajeev.pre.lambda.filtering.solution.CarSales app = new joerajeev.pre.lambda.filtering.solution.CarSales();
		app.setAllCars(TestUtil.getTestCars());
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
		System.out.println("=============================");
		System.out.println("\n");
	}

	
}
