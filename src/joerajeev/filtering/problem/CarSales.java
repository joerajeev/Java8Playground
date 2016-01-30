package joerajeev.lambda.problem;

import java.util.ArrayList;
import java.util.List;

import joerajeev.lambda.entities.Car;

/**
 * Car sales application 
 * This demonstrates the problem of value parameterization
 * 
 * @author Rajeev
 *
 */
public class CarSales {
	
	List<Car> allCars = new ArrayList<Car>();

	void showCarsFilterByYearRange(Integer min, Integer max){
		for (Car c : getAllCars()) {
			if(c.getYear() > ((min != null)? min : 0) 
					&& c.getYear() < ((max != null)? max : Integer.MAX_VALUE)){
				System.out.println(c);
			}
		}
	}
	
	void showCarsFilterByKMRange(Integer min, Integer max){
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
