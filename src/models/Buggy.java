package models;

public class Buggy extends Vehicle{

	public boolean lock(Key key){
		return false;//Buggy has no keys
	}
	private String make;

	public Buggy(){
		this.make = "";
	}

	@Override
	public Vehicle newInstance(){
		return new Buggy();
	}

}
