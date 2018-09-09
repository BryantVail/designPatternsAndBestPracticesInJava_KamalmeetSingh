package chapter02_creationPatterns;

import models.Vehicle;

import java.util.Map;
import java.util.HashMap;

public class VehicleFactoryWithReflection {

	//object map
	private Map<String, Vehicle> registeredProducts = new HashMap<String, Vehicle>();


	public void registerVehicle(String vehicleId, Vehicle vehicle){
		registeredProducts.put(vehicleId, vehicle);
	}


	public Vehicle createVehicle(String vehicleId){
		return registeredProducts.get(vehicleId).newInstance();//polymorphism on 'newInstance()' for each class
	}

}//end VehicleFactoryWithReflection
