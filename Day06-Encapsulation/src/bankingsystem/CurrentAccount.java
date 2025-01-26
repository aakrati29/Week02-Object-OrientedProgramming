package bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable{
    private final double interestRate = 0.1;
    private final double loanMultiplier = 4;
    CurrentAccount(int accountNumber, String holderName, int balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if(!(amount <= calculateLoanEligibility())) {
            System.out.println("Not eligible");
        } else {
            System.out.println("Yes you are eligible");
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * loanMultiplier;
    }
}
