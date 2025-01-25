package hierarchicalinheritance;

class BankAccount {
    int accountNumber;
    int balance;

    BankAccount(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getInfo(){
        return "Account Number : " + accountNumber + ", Balance : " + balance;
    }
}

class SavingsAccount extends BankAccount{
    int fixedDepositAccount;
    int interestRate;

    SavingsAccount(int accountNumber, int balance, int fixedDepositeAccount, int interestRate){
        super(accountNumber, balance);
        this.fixedDepositAccount = fixedDepositeAccount;
        this.interestRate = interestRate;
    }

    @Override
    public String getInfo(){
        return super.getInfo()+ ", Fixed Deposite Account : "+ fixedDepositAccount + ", Interest Rate : " + interestRate;
    }
}

class CheckingAccount extends BankAccount{
    int withdrawalLimit;

    CheckingAccount(int accountNumber, int balance, int withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public String getInfo(){
        return super.getInfo()+ ", WithDraw Amount : " + withdrawalLimit;
    }

}

class FixedDepositAccount extends BankAccount{
    int depositeAmount;

    FixedDepositAccount(int accountNumber, int balance, int depositeAmount){
        super(accountNumber, balance);
        this.depositeAmount = depositeAmount;
    }

    @Override
    public String getInfo(){
        return super.getInfo()+ ", Deposite Amount : " + depositeAmount;
    }
}

public class BankAccountTypes{
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(12455522, 5000);
        System.out.println(bank.getInfo());

        SavingsAccount saccount = new SavingsAccount(1245502, 50000, 3000, 5);
        System.out.println(saccount.getInfo());

        CheckingAccount ca = new CheckingAccount(1254477, 5000, 1000);
        System.out.println(ca.getInfo());

        FixedDepositAccount fa = new FixedDepositAccount(1205477, 5000, 2000);
        System.out.println(fa.getInfo());
    }
}

