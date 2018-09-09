package chapter02_creationPatterns.FactoryMethodPattern;

import models.Vehicle;

public class SmallSportsCar extends Vehicle {

	private String make;

	public String getMake(){
		return this.make;
	}

	public void setMake(String make){
		this.make = make;
	}

	public SmallSportsCar(){
		this.make = "";
	}

	public SmallSportsCar(String make){
		this.make = make;
	}



}
