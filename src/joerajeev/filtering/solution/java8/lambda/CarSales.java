package joerajeev.lambda.solution.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import joerajeev.lambda.entities.Car;

/**
 * Car sales application
 * Demonstrates the power of behaviour parameterization using functional interfaces
 * Uses Java8 Predicate interface
 * 
 * @author Rajeev
 *
 */
public class CarSales {

	List<Car> allCars = new ArrayList<Car>();
	
	public void showFilteredCars(Predicate<Car> pred){
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
