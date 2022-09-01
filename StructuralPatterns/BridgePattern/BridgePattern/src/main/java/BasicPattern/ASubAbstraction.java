
package BasicPattern;

public class ASubAbstraction implements AnAbstraction{
	
	private AnAbstrationImplementation implementation; //Burada bunun olması bridge burada. UML de oldugu gibi.
	
	public ASubAbstraction(AnAbstrationImplementation implementation){
		this.implementation = implementation;
	}

	@Override
	public void doIt() {
		System.out.println("I am extending AnAbstraction.");
		implementation.doingIt();
	}
}
