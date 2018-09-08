package models;

public class Mechanic implements IRepairable {

	//repair(vehicle: IRepairable)
	@Override
	public void repair(){
		//repaired
		System.out.println("repaired by mechanic");
	}

}
