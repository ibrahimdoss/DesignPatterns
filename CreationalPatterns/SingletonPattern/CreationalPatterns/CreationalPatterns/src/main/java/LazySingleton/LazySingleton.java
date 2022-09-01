package LazySingleton;

public class LazySingleton {
	
private static LazySingleton singleton;
	
	private static int count;
	private String name;

	private LazySingleton() {
		count++;
		name = "LazySingleton" + count;
	}

	public static LazySingleton getInstance() {
		if(singleton == null)
			singleton = new LazySingleton();
		return singleton;
	}

	public void printName() {
		System.out.println(name);
	}
	
	//Singleton'dan farkı if ile null ise singleton oluşturuyoruz değilse oluşturmuyoruz.
	//Bu durumda lazy singleton istediğimiz durumda çalışacak.
}
