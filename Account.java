package q1;

public class Account {
	private int accountNumber;
	private String accountHolderName;
	private int balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNumber, String accountHolderName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}
	

	public int doDeposit(int amount) {
		balance=balance+amount;
		return balance;
	}
	public int doWithDrawal(int amount) throws InsufficientFundException{
		
		if(balance-amount<5000) {
			
			throw new InsufficientFundException("Cannot Withdraw"+ amount + "/- as balance is only :"+balance + "/-");
			
		}
		balance= balance-amount;
		
		return balance;
	}	
}
