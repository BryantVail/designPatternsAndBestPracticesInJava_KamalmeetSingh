package chapter01.polymorphism;

public class Vehicle{
	private String name;
	public Vehicle(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public String toString(){
		return "Vehicle: "+name;
	}
}




