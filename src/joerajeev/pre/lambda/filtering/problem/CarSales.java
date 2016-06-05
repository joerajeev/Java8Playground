package joerajeev.pre.lambda.filtering.problem;

import java.util.ArrayList;
import java.util.List;

import joerajeev.entities.Car;

/**
 * Car sales application that demonstrates the problem of value parameterization.
 * In order to filter by different values, we have to keep exposing different API's.
 * What we need is to be able to pass in the filtering behaviour.
 * This was achieved in java before version 8 by passing implementations of functional interfaces.
 * @see joerajeev/pre/lambda/filtering/solution/CarSales.java and
 * @see joerajeev/lambda/filtering/solution/CarSalesConsumer.java
 * 
 * @author Rajeev
 *
 */
public class CarSales {
	
	List<Car> allCars = new ArrayList<Car>();

	public void showCarsFilterByYearRange(Integer min, Integer max){
		for (Car c : getAllCars()) {
			if(c.getYear() > ((min != null)? min : 0) 
					&& c.getYear() < ((max != null)? max : Integer.MAX_VALUE)){
				System.out.println(c);
			}
		}
	}
	
	public void showCarsFilterByKMRange(Integer min, Integer max){
		for (Car c : getAllCars()) {
			if(c.getKilometers() > min && c.getKilometers() < max){
				System.out.println(c);
			}
		}
	}
	
	public void setAllCars(List<Car> cars){
		this.allCars = cars;
	}
	
	public List<Car> getAllCars(){
		return this.allCars;
	}
	

}
