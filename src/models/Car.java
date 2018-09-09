package models;

public class Car extends Vehicle{

	//setName(),

	private String make;
	private String model;
	private int year;
	private boolean locked;

	//make, model, year
	public Car(){
		this.make = "";
		this.model = "";
		this.year = 0;
		this.locked = false;
	}

	public double caluculatePrice(){
		//code
		return 19.95;
	}

	public boolean lock(Key key){
		//lock

		if(this.locked == true){
			System.out.println("Car already locked");
			return false;

		}else{
			System.out.println("Car now locked");
			return true;
		}
	}

	public boolean unlock(){
		//lock
		if(this.locked == false){
			System.out.println("Car already unlocked");
			return false;

		}else{
			System.out.println("Car now unlocked");
			return true;
		}
	}

}
