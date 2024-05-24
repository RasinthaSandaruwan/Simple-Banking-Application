import java.util.Scanner;

public class bank{

	Scanner sc = new Scanner(System.in);

	double balance = 0.0;
	double amount,withdraw;

	public void displayMenu(){

		System.out.println("\nWelcome to Simple Banking Application");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Please select an option: ");
	} 

	public void checkBalance(){
		System.out.println("Your current balance is:"+ balance);
	}

	public void makeDeposit(){

		System.out.println("Enter the amount to deposit:");
		amount = sc.nextDouble();

		if(amount>0){
			balance=balance+amount;
			System.out.println("You have successfully deposited "+ amount);
		}
		else{
			System.out.println("Invalid amount. Please enter a positive value.");
		}
	}


	public void makeWithdrawal(){
		System.out.println("Enter the amount to Withdraw:");
		withdraw = sc.nextDouble();

		if(withdraw>0 && withdraw<=amount){
			balance=balance-withdraw;

			System.out.println("You have successfully withdrawn"+withdraw);
		}
		else if(balance<withdraw){
			System.out.println("Insufficient balance. Please enter a lower amount.");
		}
		else{
			System.out.println("Invalid amount. Please enter a positive value.");
		}
	}

	public void getUserChoice(){

		int choice;

		choice = sc.nextInt();

		switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    makeDeposit();
                    break;
                case 3:
                    makeWithdrawal();
                    break;
                case 4:
                    System.out.println("Exiting the application. Thank you for using our services!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
        }
	}



	public static void main(String[] args) {
		
		bank bb = new bank();

		while (true) {
			bb.displayMenu();
			bb.getUserChoice();	
		}
	}
}