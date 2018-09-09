package chapter02_creationPatterns;

import models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class FactoryWithClassRegistration {

	private Map<String, Vehicle> registeredProducts = new HashMap<String, Vehicle>();

	public void registerVehicle(String vehicleId, Vehicle vehicle){
		registeredProducts.put(vehicleId, vehicle);
	}

	public Vehicle createVehicle(String vehicleId){
		return registeredProducts.get(vehicleId).newInstance();
	}

}
