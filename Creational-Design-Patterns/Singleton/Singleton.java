
public class Singleton {

	private static Singleton singletonInstance = null;
	private Object lockObject = new Object();

	private Singleton() {

	}

	public static Singleton getSingletonInstance() {

		if(singletonInstance == null) {

			synchronized (Singleton.class) {

				if(singletonInstance == null) {

					singletonInstance = new Singleton();
				}
			}
		}

		return singletonInstance;
	}

}
