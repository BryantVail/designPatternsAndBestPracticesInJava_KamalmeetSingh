package chapter02_creationPatterns;

public class Singleton {

	private static Singleton instance;
	private Singleton(){
		System.out.println("Singleton initiated");
	}

	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
			return instance;
		}else{
			return instance;
		}
	}

}
