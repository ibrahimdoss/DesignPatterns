package patternSolution;

public abstract class AbstractHandler implements Handler {
	protected Handler successor;
	protected Handler predecessor;
	protected Help help;
	
	public AbstractHandler(Handler successor, Handler predecessor) {
		this.successor = successor;
		this.predecessor = predecessor;
	}
}
