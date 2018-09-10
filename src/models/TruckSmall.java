package models;

public class TruckSmall extends Vehicle {

	private String make;



	public TruckSmall(){
		this.make = "";
	}

	public String getMake(){
		return this.make;
	}


	//Inherited Methods/ Factory NewInstance
//	@Override
//	public Vehicle newInstance(){
//		return new TruckSmall();
//	}

}
