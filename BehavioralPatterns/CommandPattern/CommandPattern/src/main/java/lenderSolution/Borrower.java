package lenderSolution;

public class Borrower implements Command {

	@Override
	public void execute(int money) {
		System.out.println("Spending for family!");
	}
}
