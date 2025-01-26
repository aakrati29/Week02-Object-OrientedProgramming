package bankingsystem;

public abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private int balance;

    BankAccount(int accountNumber, String holderName, int balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public String  getHolderName(){
        return holderName;
    }
    public void setHolderName(String holderName){
        this.holderName = holderName;
    }

    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public int deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
        return balance;
    }

    public int withdraw(double amount){
        if(balance > 0){
            balance -= amount;
        }
        return balance;
    }
}
