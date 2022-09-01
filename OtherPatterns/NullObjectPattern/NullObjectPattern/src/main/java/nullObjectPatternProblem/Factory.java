package nullObjectPatternProblem;

import nullObjectPattern.*;

public class Factory {

	public AbstractObject create() {
		int i = (int) (Math.random() * 2);
		AbstractObject o = switch (i) {
		case 0 -> new RealObject();
		case 1 -> null;
		default -> new RealObject();
		};

		return o;
	}
}
