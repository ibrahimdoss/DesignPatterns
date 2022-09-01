package CommandAc;

public interface Command {
	
	public void execute(Temperature temperature);
	
	public void undo();
	
	public void redo();
}
