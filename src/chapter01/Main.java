package chapter01;

public class Main {

	public static void main(String[] args){

		Vehicle vehicleV = new Vehicle("vehicle");
		Vehicle vehicleC = new Car("Car");
		System.out.println(vehicleV.toString());
		System.out.println(vehicleC.toString());

	}

}
