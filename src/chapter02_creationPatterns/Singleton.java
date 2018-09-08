package chapter02_creationPatterns;

public class Singleton {

	private static Singleton instance;

	//private constructor
	private Singleton(){
		System.out.println("Singleton initiated");
	}

	public static synchronized Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
			return instance;
		}else{
			return instance;
		}
	}

	public void doSomething(){
		System.out.println("Something is done");
	}

}//end class
