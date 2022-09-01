package SingletonSerializableProblem;

import java.io.Serializable;

public class SingletonSerializable implements Serializable{
	
	private static int count;
    private String name;

    private SingletonSerializable() {
        name = "Singleton" + count;
        count++;
    }

    public String getName() {
        return name;
    }

    private static class SingletonHelper{
        private static final SingletonSerializable INSTANCE = new SingletonSerializable();
    }

    public void printName() {
        System.out.println(name); ;
    }

    public static SingletonSerializable getInstance(){
        return SingletonHelper.INSTANCE;
    }

}
