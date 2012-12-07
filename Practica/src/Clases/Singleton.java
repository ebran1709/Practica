package Clases;

/**
 * @param args
 */

public class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	private synchronized static void createInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
	}

	public static Singleton getInstance() {
		createInstance();
		return singleton;
	}

}
