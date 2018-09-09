package models;

public class Bike extends Vehicle {

	private String make;

	public Bike(){
		this.make = "";
	}

	public String getMake(){
		return this.make;
	}

	//Inherited Methods/ Factory NewInstance
	@Override
	public Vehicle newInstance(){
		return new Bike();
	}

}
