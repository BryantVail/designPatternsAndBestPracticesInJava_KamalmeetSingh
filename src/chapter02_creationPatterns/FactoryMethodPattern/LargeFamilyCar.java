package chapter02_creationPatterns.FactoryMethodPattern;

public class LargeFamilyCar {

	private String make;

	public String getMake(){
		return this.make;
	}

	public void setMake(String make){
		this.make = make;
	}

	public LargeFamilyCar(){
		this.make = "";
	}

	public LargeFamilyCar(String make){
		this.make = make;
	}

}
