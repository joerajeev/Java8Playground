package joerajeev.pre.lambda.filtering.solution;

import java.util.ArrayList;
import java.util.List;

import joerajeev.entities.Car;

/**
 * Car sales application.
 * Demonstrates the power of behaviour parameterization using functional interfaces.
 * This pattern existed before Java 8. However the the value of Lambda expressions 
 * can be seen by comparing the consumption of this API.
 * @see joerajeev/pre/lambda/filtering/solution/CarSalesConsumer.java vs
 * @see joerajeev/lambda/filtering/solution/CarSalesConsumer.java
 * 
 * @author Rajeev
 *
 */
public class CarSales {

	List<Car> allCars = new ArrayList<Car>();
		
	public void showFilteredCars(CarPredicate pred){
		for(Car c: getAllCars()){
			if(pred.test(c)){
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
