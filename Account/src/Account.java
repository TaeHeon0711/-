public abstract class Account implements Valuable{
	private double account;
	
	public Account(){
		
	}
	@Override
	public double EstimateValue(int month){
		return account;
	}
	@Override
	public double EstimateValue(){
		return account;
	}	
	
	public abstract double getWithdrawableAccount();
	public abstract double passTime(int moon);
	public abstract double passTime();
	public double getBalance(){
		return account;
	}
	protected double setBalance(double account){
		this.account = account;
		return account;
	}
	
    public double credit(double add){
    	account += add;
    	return account;
    }
    
    public double balance(int num){
    	
    	System.out.printf("account%d balance : $%.2f\n",num, account);
    	if(account<0){
    		System.out.printf("Oh! Your account%d is small than 0\n",num);
    		System.out.println();
    	}
    	return account;
    }
	public void  debit(double amount)throws ArithmeticException{
		account -= amount;
		
	}	
	
	
}