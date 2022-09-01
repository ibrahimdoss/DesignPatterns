package templateMethodTask;

public class Scan extends Task {

	public Scan(String name, int interval, int repetation) {
		super(name, interval, repetation);
	}

	@Override
	public void doTask() {
		System.out.println("I'm scanning!");
	}
}
