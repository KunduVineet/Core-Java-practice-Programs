package in.vk.main;

public class BankTest {
	
	public static void main(String[] args) {
		Bank b = new SavingsAccount(10000);
		
		b.executeTransaction("DEPOSIT", 250);
		b.executeTransaction("WITHDRAW", 200);
		b.executeTransaction("DEPOSIT", 250);
		b.executeTransaction("WITHDRAW", 350);

		System.out.println("Final balance - "+ b.getBalance());
	}

}
