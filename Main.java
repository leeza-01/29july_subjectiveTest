package q1;

public class Main {
	public static void main(String[] args) {

	Account acc=new Account();
	
	acc.setAccountNumber(1234);
	acc.setAccountHolderName("leeza");
	acc.setBalance(5000);
	
	
System.out.println("Balance After Deposit:"+acc.doDeposit(200));


try {
	System.out.println("Balance After WithDrawal:"+acc.doWithDrawal(600));
}
catch
	(InsufficientFundException e){
		System.out.println(e.getMessage());
		
	   }
    }
  }

