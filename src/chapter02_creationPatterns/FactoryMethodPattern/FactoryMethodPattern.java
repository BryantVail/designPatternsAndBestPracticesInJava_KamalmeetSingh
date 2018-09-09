package chapter02_creationPatterns.FactoryMethodPattern;

import models.Vehicle;

public abstract class FactoryMethodPattern {

	protected abstract Vehicle createVehicle(String item);

	public Vehicle orderVehicle(String size, String color){
		Vehicle vehicle = createVehicle(size);
		vehicle.testVehicle();
		vehicle.setColor(color);
		return vehicle;
	}

}
