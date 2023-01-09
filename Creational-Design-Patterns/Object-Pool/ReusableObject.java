import java.util.ArrayList;

public class ReusableObject {

	private static int maxPoolSize = 10;
	private static int currentPoolSize = 0;
	private static ArrayList<ReusableObject> objectPool = new ArrayList<ReusableObject>();


	private ReusableObject() {

	}

	public static void setMaxPoolSize(int size) {
		maxPoolSize = size; // Default is 10
	}

	public static ReusableObject acquireReusableObject() throws Exception {

		synchronized (ReusableObject.class) {


			if(objectPool.size() == 0 && currentPoolSize < maxPoolSize) {
				objectPool.add(new ReusableObject());
				currentPoolSize++;
			}

			if(objectPool.size() > 0) {
				return objectPool.remove(0);
			}else {
				throw new Exception("EmptyPool");
			}
		}
	}


	public static void releaseReusableObject(ReusableObject reusableObject) {
		
		resetReusableObject(reusableObject);
		objectPool.add(reusableObject);
	}

	private static void resetReusableObject(ReusableObject reusableObject) {
		// Perform reset operations on the current object if any
	}
}
