import java.util.ArrayList;

class Bank {
    final String bankName = "SBI";
    ArrayList<Customer> customers; 

    Bank() {
        customers = new ArrayList<>();
    }

    public void openAccount(String customerName, int initialBalance) {
        // Generate a new account number based on the size of the customer list
        int accountNumber = 1000 + customers.size() + 1;

        // Create a new Customer object and add it to the list of customers
        Customer newCustomer = new Customer(customerName, accountNumber, initialBalance);
        customers.add(newCustomer);

        System.out.println("Account successfully opened for " + customerName + " with Account Number : " + accountNumber);
    }
}

class Customer {
    String customerName;
    int accountNumber;
    int balance;

    Customer(String customerName, int accountNumber, int balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println("Balance for " + customerName + " (Account : " + accountNumber + ") is : " + balance);
    }
}

public class BankAndAccountHolders {
    public static void main(String[] args) {
        // Create a Bank object
        Bank sbi = new Bank();

        // Open accounts for customers
        sbi.openAccount("Aakrati", 5000);
        sbi.openAccount("Ram", 3000);
        sbi.openAccount("Shiv", 2000);
        sbi.openAccount("Om", 1500);

        // Create references for specific customers
        Customer c1 = sbi.customers.get(0); // First customer (Aakrati)
        Customer c2 = sbi.customers.get(1); // Second customer (Ram)

        // View balances of specific customers
        c1.viewBalance();
        c2.viewBalance();
    }
}
