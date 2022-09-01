package nullObjectPattern;

public class NullObject extends AbstractObject {

	@Override
	public void request() {
		System.err.println("Doing nothing.");
	}
}
