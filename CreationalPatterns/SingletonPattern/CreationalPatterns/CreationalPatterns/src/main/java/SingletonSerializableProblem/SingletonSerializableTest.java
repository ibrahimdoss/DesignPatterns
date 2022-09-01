package SingletonSerializableProblem;


public class SingletonSerializableTest {
	
	public static void main(String[] args) {

		SingletonSerializable singleton1 = SingletonSerializable.getInstance();

		String filePath = "";
		Serializer.serializeToFile(singleton1, filePath);

		SingletonSerializable singleton2 = Serializer.deserializeToObject(SingletonSerializable.class, filePath);

		System.out.println();

		if (singleton1 == singleton2) {
			System.out.println("2 instances are equal");
		} else {
			System.out.println("2 instances are NOT equal");
		}

		System.out.println();
		
		if (singleton1.getName().equals(singleton2.getName()))
			System.out.println("Their names are same.");

		System.out.println();
		
		Serializer.print(singleton1);
		Serializer.print(singleton2);
	}
}
