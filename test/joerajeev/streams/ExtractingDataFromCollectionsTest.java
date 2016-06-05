package joerajeev.streams;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

import joerajeev.entities.Car;
import joerajeev.lambda.util.TestUtil;

public class ExtractingDataFromCollectionsTest {

	private static List<Car> cars = TestUtil.getTestCars();
	
	/**
	 * Get unique car makes from a list of cars
	 */
	@Test
	public void testGetMakesFromCars() {
		Set<String> makes = cars.stream()
								.collect(Collectors.mapping(Car::getMake, Collectors.toSet()));
		assertEquals(5, makes.size());
	}
	
	/**
	 * Get average KM's from cars.
	 */
	@Test
	public void testGetAverageKilometersFromCars() {
		Double averageKMs = cars.stream()
								.collect(Collectors.averagingInt(Car::getKilometers));
		assertEquals(TestUtil.getAverageKMs(cars), averageKMs.doubleValue(), 0.01);
	}
	
	/**
	 * Get cars that have done less than 100k KM's
	 */
	@Test
	public void testGetCarsDoneLessThanSpecifiedKMs(){
		
		List<Car> filteredCars = cars.stream()
							.filter( c -> c.getKilometers() < 100000)
							.collect(Collectors.toList());
		assertEquals(5, filteredCars.size());
		assertTrue(filteredCars.get(0).getKilometers() < 100000);
	}


}
