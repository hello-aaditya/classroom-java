package oops.interfaceCode;



public class SavingAccount implements BankOperations{
	private String name;
	private long accountId;
	private double balance;
	
	@Override
	public void openAccount(String name,  long accountId, double initialAmount) {
		this.name = name;
		this.accountId = accountId;
		this.balance = initialAmount;
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("Account created successfully!");
		System.out.println("Account holder name: " + name);
		System.out.println("Account ID: " + accountId);
		System.out.println("Initial Balance: ₹" + balance);
	}
	
	@Override
	public void deposit(double amount) {
			balance += amount;
			System.out.println("₹" + amount + " deposited to your account successfully.");
			System.out.println("Update Balance: ₹" + balance);
	}
	
	@Override
	public void withdraw(double amount) {
			if(balance < amount) {
				System.out.println("Account ID: " + accountId + " has insufficient balance.");
				System.out.println("Update Balance: ₹" + balance);
			} else {
				balance -= amount;
				System.out.println("₹" + amount + " withdrawn successfully!");
				System.out.println("Update Balance: ₹" + balance);
			}
	}
	
	@Override
	public void checkBalance() {
			System.out.println("Current Balance: ₹" + balance);
	}
	
	@Override
	public void closeAccount() {
		long oldId = this.accountId;
		this.accountId = 0;
		this.balance = 0;
		this.name = null;
			System.out.println("Account ID: " + oldId + " is closed.");
	}
}
