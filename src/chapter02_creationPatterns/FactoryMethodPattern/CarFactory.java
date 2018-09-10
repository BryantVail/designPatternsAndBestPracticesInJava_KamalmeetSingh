package chapter02_creationPatterns.FactoryMethodPattern;


import models.Vehicle;

public class CarFactory extends FactoryMethodPattern {

	@Override
	protected Vehicle createVehicle(String size){
		if(size.equals("small")){
			return new SmallSportsCar();
		}else if(size.equals("large")){
			return new LargeFamilyCar();
		}else{
			return null;
		}
	}

}
