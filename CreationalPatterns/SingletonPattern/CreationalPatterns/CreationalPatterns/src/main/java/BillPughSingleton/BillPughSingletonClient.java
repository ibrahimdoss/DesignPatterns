package BillPughSingleton;

public class BillPughSingletonClient extends Thread{
	
	 public static void main(String[] args) {
	        for (int i = 0; i < 1000; i++) {
	            new BillPughSingletonClient().start();
	        }
	    }

	    public void run() {
	        BillPughSingleton ls = BillPughSingleton.getInstance();
	        ls.printName();
	    }

}
