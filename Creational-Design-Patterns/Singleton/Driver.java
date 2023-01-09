
public class Driver {

	public static void main(String[] args) {
		
		Singleton singleton1 = Singleton.getSingletonInstance();
		Singleton singleton2 = Singleton.getSingletonInstance();
		Singleton singleton3 = Singleton.getSingletonInstance();
		Singleton singleton4 = Singleton.getSingletonInstance();
		
		System.out.println(singleton1 == singleton2 && singleton2 == singleton3 && singleton3 == singleton4);
	}
}
