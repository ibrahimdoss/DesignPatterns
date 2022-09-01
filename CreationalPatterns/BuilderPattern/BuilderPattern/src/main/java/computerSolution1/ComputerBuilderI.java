package computerSolution1;

import builderComputerDomain.*;

public interface ComputerBuilderI {

	public RAM buildRAM();

	public CPU buildCPU();

	public HardDrive buildHardDrive();
	
	public GraphicCard buildGraphicCard();

	public Display buildDisplay();

	public Computer buildComputer();

}
