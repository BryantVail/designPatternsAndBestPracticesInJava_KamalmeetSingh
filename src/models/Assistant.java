package models;

public class Assistant {

	public void checkKey(Car car, Key key){
		if(car.lock(key) == false) {
			System.out.println("Alert! Wrong key, wrong car or car lock is broken");

		}else{
			System.out.println("Key: "+key+" is Identified for the Given Car: "+ car);
		}
	}

}
