package joerajeev.streams;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.BeforeClass;
import org.junit.Test;

import joerajeev.entities.Car;
import joerajeev.lambda.util.TestUtil;

/**
 * Demonstrates and tests stream API.
 * 
 * @author Joseph
 *
 */
public class GroupingByTest {
	
	public static List<Car> cars;
	
	@BeforeClass
	public static void setUpBeforeClass(){
		cars = TestUtil.getTestCars();
	}

	/**
	 * Problem:
	 * Given a list of Cars, get list cars for each make
	 * i.e. Map<String, List<Car>> where the key is the make.
	 */
	@Test
	public void testListCarsGroupedByMake() {
		Map<String, List<Car>> histogram = cars.stream()
											.collect(Collectors.groupingBy(Car::getMake));
		
		assertEquals(3, histogram.get("Toyota").size());
		assertEquals(2, histogram.get("Nissan").size());
		assertEquals(1, histogram.get("Mazda").size());
	}
	

	/**
	 * Problem:
	 * Given a list of Cars, list of prices for each make
	 * i.e. Map<String, List<BigDecimal>> where the key is the make.
	 */
	@Test
	public void testListPricesGroupedByMake() {
		Map<String, List<BigDecimal>> histogram = cars.stream()
											.collect(Collectors.groupingBy(
													Car::getMake,
													Collectors.mapping(Car::getPrice,
															Collectors.toList())));
		
		assertEquals(3, histogram.get("Toyota").size());
		assertEquals(2, histogram.get("Nissan").size());
		assertEquals(1, histogram.get("Mazda").size());
		assertEquals(new BigDecimal(14000.0), histogram.get("Mazda").get(0));
	}

	/**
	 * Problem:
	 * Given a list of Cars, get average kilometers grouped by make.
	 * i.e. Map<String,Double> where the key is the make.
	 */
	@Test
	public void testGetAveragePricesGroupedByMake(){
		Map<String, Double> averageKMs = cars.stream()
					.collect(Collectors.groupingBy(Car::getMake,
							Collectors.averagingDouble(Car::getKilometers)));
		assertEquals(85584L, averageKMs.get("Toyota").doubleValue(), 0.01);
	}
}
