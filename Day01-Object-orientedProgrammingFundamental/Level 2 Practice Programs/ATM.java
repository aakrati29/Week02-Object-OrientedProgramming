class BankAccount{
	String accountHolder;
	long accountNumber;
	long balance;
	
	// Initializing constructor
	BankAccount(String accountHolder, long accountNumber, long balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// Create a method to find depositing amount
	public void depositingMoney(long amount){
		if(amount > 0){
			this.balance += amount;
			System.out.println("Deposit Successful");
		}
		else{
			System.out.println("Insufficient balance");
		}
	}

	// Create a method to find withdrawing amount
	public void withdrawingMoney(long amount){
		if(amount < this.balance){
			this.balance -= amount;
			System.out.println("Withdrawing Successful");

			
		}
		else{
			System.out.println("Insufficient balance");
		}
	}
	
	// Create a method to display current balance
	public void currentBalance(){
		System.out.println("Displaying current balance " + this.balance);
	}
}
		
public class ATM{
	public static void main(String [] args){
		
		// Create object of BankAccount class
		BankAccount bank = new BankAccount("Ram", 514068421154L, 50000);
		bank.depositingMoney(1000);
		bank.withdrawingMoney(0);
		bank.currentBalance();
	}
}