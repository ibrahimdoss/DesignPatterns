package DoubleCheckedLockingSingleton;

public class DoubleCheckedLockingSingleton {
//	private static DoubleCheckedLockingSingleton singleton;
	private static volatile DoubleCheckedLockingSingleton singleton;

	private static int count;
	private String name;

	private DoubleCheckedLockingSingleton() {
		name = "DoubleCheckedLockingSingleton" + count;
		count++;
	}
	
	
//TODO asagıda ilk null check synchronized şekilde yapıyoruz, sonrasındaki null check ise
	//Unsynchronized null check oldugu icin bu sorunu da böyle asmıs oluyoruz.
	public static DoubleCheckedLockingSingleton getInstance() {
		// Unsynchronized null check is faster.
		if (singleton == null) {
			// Less synchronized area is better.
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (singleton == null) {
					singleton = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return singleton;
	}

	public void printName() {
		System.out.println(name);
	}
}
