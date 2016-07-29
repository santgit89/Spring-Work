package business;

public class Bank {
	private int amt=5000;
	private String acct="sbi123";
	
	public int deposit(int amt,String acct){
		if(acct.equals(this.acct)){
			this.amt+=amt;
			return this.amt;
		}
		else{
		throw new AccountNotFoundException();
	}
	
	}
}
