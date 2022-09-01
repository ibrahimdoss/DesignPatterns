
package bridgeViolationP;

public class ASubType extends AType {
	private String aStringVariable;

	public ASubType(int anIntVariable, boolean aBoolVariable) {
		super(anIntVariable, aBoolVariable);
	}

	@Override
	public void doIt() {
		if (aBoolVariable)
			aStringVariable = "My variable: " + anIntVariable;
		else
			aStringVariable = "Nothing happened!";
	}

	public void writeIt() {
		System.out.println("aStringVariable : " + aStringVariable);
	}
}
