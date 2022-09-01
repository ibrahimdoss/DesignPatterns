package stateAccount;

public interface AccountStatus {
	
	public void withdraw(int amount);
	public void deposit(int amount);
	public void transfer(int amount);
	public void close();
	
}
