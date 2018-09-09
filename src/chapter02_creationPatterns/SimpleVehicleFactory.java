package chapter02_creationPatterns;

import models.Bike;
import models.Car;
import models.Truck;
import models.Vehicle;

public class SimpleVehicleFactory {

	public enum VehicleType{
		Bike, Car, Truck
	}

	public static Vehicle create(VehicleType type){

		if(type.equals(VehicleType.Bike))
			return new Bike();
		if(type.equals(VehicleType.Car))
			return new Car();
		if(type.equals(VehicleType.Truck))
			return new Truck();
		else return null;

	}

}
