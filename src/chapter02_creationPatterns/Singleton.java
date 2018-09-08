package chapter02_creationPatterns;

public class Singleton {

	private static Singleton instance;

	//private constructor
	private Singleton(){
		System.out.println("Singleton initiated");
	}

	public static Singleton getInstance(){
		if(instance == null){
			synchronized (Singleton.class){
				instance = new Singleton();
				return instance;
			}//end synchronized block
		}else{
			return instance;
		}
	}

	public void doSomething(){
		System.out.println("Something is done");
	}

}//end class
