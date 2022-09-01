package AccountSolution;

public interface TransactionFactory {
	
	public Transaction createWithdraw();
	
	public Transaction createDeposit();

}
