package models;

public abstract class Vehicle {
	private String make;
	private String color;

	public Vehicle(){
		this.make = "";
	}


	public Vehicle(String make){
		this.make = make;
	}

	//abstract public Vehicle newInstance();


	public void testVehicle(){
		//test it
	}

	public void setColor(String color){
		//setColor
		this.color = color;
	}



}
