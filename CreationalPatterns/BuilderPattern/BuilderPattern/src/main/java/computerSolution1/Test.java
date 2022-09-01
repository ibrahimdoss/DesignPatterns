package computerSolution1;

import builderComputerDomain.*;

public class Test {

	public static void main(String[] args) {

		ComputerBuilderI builder = new ComputerBuilder();
		Computer computer = builder.buildComputer();
		computer.start();

		RAM ram = builder.buildRAM();
		Display display = builder.buildDisplay();

	}
}
