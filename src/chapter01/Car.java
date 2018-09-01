package chapter01;

public class Car extends Vehicle{

	private String name;
	public Car(String name){
		super(name);
	}

	public String toString(){

		return "Car: "+ getName();
//		return "Car: "+ this.name; //this will return 'null' for "this.name"
	}
}




