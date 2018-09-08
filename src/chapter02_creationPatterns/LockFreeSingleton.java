package chapter02_creationPatterns;

public class LockFreeSingleton {

	private static final LockFreeSingleton instance = new LockFreeSingleton();

	private LockFreeSingleton(){
		System.out.println("Singleton initiated");
	}

	public static synchronized LockFreeSingleton getInstance(){
		return instance;
	}

	public void doSomething(){
		System.out.println("Something is done");
	}

}
