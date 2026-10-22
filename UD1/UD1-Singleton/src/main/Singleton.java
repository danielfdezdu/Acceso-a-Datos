package main;

public class Singleton {
	
	private static Singleton INSTANCE = null;
	
	private Singleton() {}
	
	public synchronized static Singleton getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Singleton();
		
		return INSTANCE;
	}
}
