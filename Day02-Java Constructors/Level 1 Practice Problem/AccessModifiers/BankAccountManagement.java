class BankAccount {
    public String accountNumber;        
    protected String accountHolder;     
    private double balance;             
	
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Create a method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Create a method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Create a method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount : " + amount);
        } 
		
		else {
            System.out.println("Insufficient balance");
        }
    }

    // Create a method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number is : " + accountNumber);
        System.out.println("Account Holder is : " + accountHolder);
        System.out.println("Balance is : " + balance);
    }
}

class SavingsAccount extends BankAccount {

    private double interestRate;
	
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); 
        this.interestRate = interestRate;
    }

    // Create a method to calculate interest
    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        System.out.println("Interest Earned: " + interest);
    }

    // Create a method to display savings account details
    public void displaySavingsAccountDetails() {
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountManagement {

    public static void main(String[] args) {
	
        // Create a BankAccount object
        BankAccount account1 = new BankAccount("123456789", "Alice", 5000.0);
        System.out.println("Bank Account Details :");
        account1.displayAccountDetails();

        // Deposit and withdraw money
        System.out.println("\nTransactions :");
        account1.deposit(2000.0);
        account1.withdraw(1500.0);
        account1.displayAccountDetails();

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Bob", 10000.0, 5.0);
        System.out.println("\nSavings Account Details :");
        savingsAccount.displaySavingsAccountDetails();

        // Calculate interest
        System.out.println("\nInterest Calculation :");
        savingsAccount.calculateInterest();
    }
}
