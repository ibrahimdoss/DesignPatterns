package computerSolution5;

public interface LazyComputerBuilderI {

	public LazyComputerBuilderI buildRAM();

	public LazyComputerBuilderI buildCPU();

	public LazyComputerBuilderI buildHardDrive();
	
	public LazyComputerBuilderI buildGraphicCard();

	public LazyComputerBuilderI buildDisplay();
	
	public LazyComputerBuilderI buildMouse();
	
	public LazyComputerBuilderI buildKeyboard();

	public Computer build();

}
