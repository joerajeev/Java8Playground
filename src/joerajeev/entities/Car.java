package joerajeev.entities;

import java.math.BigDecimal;

/**
 * Car entity class
 * 
 * @author Rajeev
 *
 */
public class Car {

	private String make;
	private String model;
	private String type;
	private Integer year;
	private Integer kilometers;
	private String colour;
	
	public enum Transmission{
		AUTO, MANUAL
	}
	private Transmission transmision;
	private BigDecimal price;
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year
				+ ", price=" + price + "]";
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getKilometers() {
		return kilometers;
	}
	public void setKilometers(Integer kilometers) {
		this.kilometers = kilometers;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Transmission getTransmision() {
		return transmision;
	}
	public void setTransmision(Transmission transmision) {
		this.transmision = transmision;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
