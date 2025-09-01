package in.vk.main;

public class SavingsAccount implements Bank{

	private double balance;
	
	
	public SavingsAccount(double balance) {
		super();
		this.balance = balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
