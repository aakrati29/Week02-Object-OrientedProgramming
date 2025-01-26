package bankingsystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1584455, "Aakrati",8000);
        CurrentAccount currentAccount = new CurrentAccount(2446651, "Ankit", 6000);

        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(savingsAccount);
        bankAccounts.add(currentAccount);

        System.out.println("***************************************");

        for(BankAccount a : bankAccounts){
            System.out.println("Account number : " + a.getAccountNumber());
            System.out.println("Account Holder name : " + a.getHolderName());
            System.out.println("Balance is : " + a.getBalance());
            System.out.println("Calculated interest  : " + a.calculateInterest());

            if(a instanceof Loanable){
                Loanable loanable = (Loanable) a;
                System.out.println("Eligibility for loan : " + ((Loanable) a).calculateLoanEligibility());
                loanable.applyForLoan(10000);
            }

            System.out.println("***************************************");
        }

    }
}
