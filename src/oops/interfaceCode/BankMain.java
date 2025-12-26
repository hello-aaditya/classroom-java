package oops.interfaceCode;


import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Account Holder Name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Account ID: ");
		long accID = input.nextLong();
		
		System.out.print("Enter Initial Amount: ");
		double amount = input.nextDouble();
		
		
		BankOperations bo = new SavingAccount();
		bo.openAccount(name, accID, amount);
		
		int choice;
		
		do {
			System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Close Account\n5. Exit");
			System.out.print("Enter Choice: ");
			choice = input.nextInt();
			
			switch(choice) {
				case 1: 
					System.out.print("Enter amount: ");
					bo.deposit(input.nextDouble());
					break;
				
				case 2:
					System.out.print("Enter amount: ");
					bo.withdraw(input.nextDouble());
					break;
					
				case 3:
					bo.checkBalance();
					break;
					
				case 4:
					bo.closeAccount();
					choice = 5;
					break;
					
				case 5:
					System.out.println("Thank You!");
					break;
					
				default:
					System.out.println("Invalid choice");
			}
		} while(choice != 5);
		
		

		input.close();
	}

}

