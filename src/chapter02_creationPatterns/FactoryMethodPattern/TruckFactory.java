package chapter02_creationPatterns.FactoryMethodPattern;

import models.Truck;
import models.TruckSmall;
import models.Vehicle;

public class TruckFactory extends FactoryMethodPattern {

	@Override
	protected Vehicle createVehicle(String size){
		if(size.equals("small")){
			return new TruckSmall();
		}else if(size.equals("large")){
			return new Truck();
		}else{
			return null;
		}
	}

}
