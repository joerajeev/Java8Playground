package joerajeev.lambda.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import joerajeev.entities.Car;
import joerajeev.entities.Car.Transmission;

/**
 * 
 * 
 * @author Joseph
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
		
		Car car6 = new Car();
		car6.setMake("Porsche");
		car6.setModel("911");
		car6.setType("Convertable");
		car6.setYear(2011);
		car6.setKilometers(33000);
		car6.setColour("Black");
		car6.setTransmision(Transmission.MANUAL);
		car6.setPrice(new BigDecimal(45000.0));
		cars.add(car6);
		
		Car car7 = new Car();
		car7.setMake("Nissan");
		car7.setModel("Pulsar");
		car7.setType("Sedan");
		car7.setYear(2005);
		car7.setKilometers(133000);
		car7.setColour("Blue");
		car7.setTransmision(Transmission.MANUAL);
		car7.setPrice(new BigDecimal(4500.0));
		cars.add(car7);
		
		Car car8 = new Car();
		car8.setMake("Toyota");
		car8.setModel("Prado");
		car8.setType("SUV");
		car8.setYear(2010);
		car8.setKilometers(123000);
		car8.setColour("Black");
		car8.setTransmision(Transmission.MANUAL);
		car8.setPrice(new BigDecimal(8500.0));
		cars.add(car8);
		
		
		Car car9 = new Car();
		car9.setMake("Toyota");
		car9.setModel("Camry");
		car9.setType("Sedan");
		car9.setYear(2011);
		car9.setKilometers(23000);
		car9.setColour("Gold");
		car9.setTransmision(Transmission.AUTO);
		car9.setPrice(new BigDecimal(18500.0));
		cars.add(car9);
		
		return cars;
	}
	
	public static double getAverageKMs(List<Car> cars) {
		double totalKMs = 0;
		for (Car car : cars) {
			totalKMs += car.getKilometers();
		}
		return totalKMs/cars.size();
	}
	
}
