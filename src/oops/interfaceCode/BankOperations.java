package oops.interfaceCode;

public interface BankOperations {
	
	void openAccount(String name, long accountId, double initialAmount);
	void deposit(double amount);
	void withdraw(double amount);
	void checkBalance();
	void closeAccount();
}
