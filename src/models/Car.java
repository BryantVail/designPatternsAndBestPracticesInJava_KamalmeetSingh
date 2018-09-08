package models;

public class Car {

	//setName(),

	private String make;
	private String model;
	private int year;

	//make, model, year
	public Car(){
		this.make = "";
		this.model = "";
		this.year = 0;
	}

	public double caluculatePrice(){
		//code
		return 19.95;
	}

	public void lock(){
		//lock
		System.out.println("Locked Car");
	}

	public void unlock(){
		//lock
		System.out.println("unLocked Car");
	}

}
