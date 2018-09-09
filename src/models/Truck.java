package models;

public class Truck extends Vehicle {

	private String make;



	public Truck(){
		this.make = "";
	}

	public String getMake(){
		return this.make;
	}


	//Inherited Methods/ Factory NewInstance
	@Override
	public Vehicle newInstance(){
		return new Truck();
	}

}
