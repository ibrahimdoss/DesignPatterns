
package BasicPattern;

public class Client {
	private AnAbstraction anAbstraction;
	
	public Client(AnAbstraction anAbstraction){
		this.anAbstraction = anAbstraction;
	}
	
	public void start(){
		anAbstraction.doIt();
	}

}
