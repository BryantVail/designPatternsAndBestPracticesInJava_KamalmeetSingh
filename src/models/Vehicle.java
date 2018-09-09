package models;

public abstract class Vehicle {
	private String make;

	public Vehicle(){
		this.make = "";
	}
	public Vehicle(String make){
		this.make = make;
	}

	abstract public Vehicle newInstance();





}
