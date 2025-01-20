class BankAccount {
	static String bankName = "SBI" ;
	String accountHolderName ;
	final int accountNumber;
	static int totalAccount;
	
	BankAccount(String accountHolderName, int accountNumber){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		totalAccount++;
	}
	
	public static void getTotalAccounts(){
		System.out.println("Total number of accounts : " + totalAccount);
	}
}		
		
public class BankAccountSystem{
	
	public static void main(String [] args){
	BankAccount account1 = new BankAccount("Aakrati", 112584466);
	BankAccount account2 = new BankAccount("Ankit", 4522187);
	BankAccount account3 = new BankAccount("Avinash", 77854126);
	BankAccount account4 = new BankAccount("Anand", 12342156);
	
		BankAccount.getTotalAccounts();
		
		if(account1 instanceof BankAccount){
			System.out.println("account1 is instance of BankAccount");
		}
		if(account2 instanceof BankAccount){
			System.out.println("account2 is instance of BankAccount");
		}
	}
}