package joerajeev.streams;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

import org.junit.Test;

import joerajeev.entities.Car;
import joerajeev.lambda.util.TestUtil;


public class ReductionTest {

	
	/**
	 * Find newest car from a list of cars.
	 */
	@Test
	public void test() {
		List<Car> cars = TestUtil.getTestCars();
		
		Car newest = cars.stream()
							.reduce((c1, c2) -> c1.getYear() > c2.getYear()? c1 : c2)
							.get();
		assertEquals(2012, newest.getYear().intValue());
	}

}
