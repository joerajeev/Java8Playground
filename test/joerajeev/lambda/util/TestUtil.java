package joerajeev.lambda.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import joerajeev.entities.Car;
import joerajeev.entities.Car.Transmission;

/**
 * 
 * 
 * @author Rajeev
 *
 */
public class TestUtil {

	public static List<Car> getTestCars(){
		List<Car> cars = new ArrayList<Car>();
		
		Car car1 = new Car();
		car1.setMake("Toyota");
		car1.setModel("Corolla");
		car1.setType("Sedan");
		car1.setYear(2005);
		car1.setKilometers(110752);
		car1.setColour("Blue");
		car1.setTransmision(Transmission.AUTO);
		car1.setPrice(new BigDecimal(10000.0));
		cars.add(car1);
		
		Car car2 = new Car();
		car2.setMake("Honda");
		car2.setModel("Civic");
		car2.setType("Sedan");
		car2.setYear(2009);
		car2.setKilometers(95245);
		car2.setColour("Silver");
		car2.setTransmision(Transmission.AUTO);
		car2.setPrice(new BigDecimal(13000.0));
		cars.add(car2);
		
		Car car3 = new Car();
		car3.setMake("Mazda");
		car3.setModel("3");
		car3.setType("Hatchback");
		car3.setYear(2012);
		car3.setKilometers(60534);
		car3.setColour("Green");
		car3.setTransmision(Transmission.AUTO);
		car3.setPrice(new BigDecimal(14000.0));
		cars.add(car3);
		
		Car car4 = new Car();
		car4.setMake("Nissan");
		car4.setModel("GTR");
		car4.setType("Sedan");
		car4.setYear(2011);
		car4.setKilometers(20345);
		car4.setColour("Red");
		car4.setTransmision(Transmission.MANUAL);
		car4.setPrice(new BigDecimal(60000.0));
		cars.add(car4);
		
		Car car5 = new Car();
		car5.setMake("Porsche");
		car5.setModel("Boxter");
		car5.setType("Convertable");
		car5.setYear(2001);
		car5.setKilometers(130374);
		car5.setColour("Silver");
		car5.setTransmision(Transmission.MANUAL);
		car5.setPrice(new BigDecimal(35000.0));
		cars.add(car5);
		
		return cars;
	}
	
}
