package joerajeev.lambda.problem;

import joerajeev.lambda.util.TestUtil;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class that acts as the caller of the joerajeev.lambda.problem.CarSales application
 * No asserts as this is not meant to be a 'proper' JUnit test class 
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
		System.out.println("\n");
		
		//What about selecting by Price, Transmission or other params?  need even more methods!
		
	}

	
}
