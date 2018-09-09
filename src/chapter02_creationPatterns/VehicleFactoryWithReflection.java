package chapter02_creationPatterns;

import models.Vehicle;

import java.util.Map;
import java.util.HashMap;

public class VehicleFactoryWithReflection {

	private Map<String, Class> registeredProducts = new HashMap<String, Class>();

	public void registerVehicle(String vehicleId, Class vehicleClass){
		registeredProducts.put(vehicleId, vehicleClass);
	}

	public Vehicle createVehicle(String type) throws InstantiationException, IllegalAccessException {
		Class productClass = registeredProducts.get(type);
		return (Vehicle)productClass.newInstance();
	}

}//end VehicleFactoryWithReflection
