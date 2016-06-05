package joerajeev.lambda.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import joerajeev.entities.Car;
import joerajeev.lambda.util.TestUtil;

/**
 * NOT A REAL TEST.
 * Demonstrates the sorting before and after lambda expressions.
 * 
 * @author Joseph Motha
 *
 */
public class SortingDemo {

	@Test
	public void preLambdaSortingExample() {
		List<Car> cars = TestUtil.getTestCars();
		Collections.sort(cars, new Comparator<Car>(){

			@Override
			public int compare(Car c1, Car c2) {
				return c1.getYear() - c2.getYear();
			}
			
		});
		
		System.out.println(cars);
		
	}
	
	@Test
	public void lambdaSortingExample() {
		List<Car> cars = TestUtil.getTestCars();
		cars.sort( (c1, c2) -> c1.getYear() - c2.getYear());
		
		System.out.println(cars);
		
	}

}
