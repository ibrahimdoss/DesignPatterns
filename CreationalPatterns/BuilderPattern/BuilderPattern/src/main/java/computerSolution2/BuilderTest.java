package computerSolution2;

import builderComputerDomain.Computer;

public class BuilderTest {

	public static void main(String[] args) {

		ComputerBuilderI builder = new ComputerBuilder();
		Computer computer = builder.build();
		computer.start();
	}
}
