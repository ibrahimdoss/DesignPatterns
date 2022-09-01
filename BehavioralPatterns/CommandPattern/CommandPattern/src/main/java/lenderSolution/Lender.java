package lenderSolution;

public class Lender {
	public void lend(Command command, int money) {
		command.execute(money);
	}
}
