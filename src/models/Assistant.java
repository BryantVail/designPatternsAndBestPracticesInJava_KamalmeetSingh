package models;

public class Assistant {

	public void checkKey(Car car, Key key){
		if(car.lock(key) == false) System.out.println("Alert! Wrong key, wrong car or car lock is broken");
	}

}
