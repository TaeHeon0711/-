public class CheckingAccount extends Account{
	private double credit_limit;
	private double interest;
	private double loan_interest;
	private double mon;

	public CheckingAccount(double account,double credit_limit, double interest,double loan_interest){
		setBalance(account);
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
	}
	public String toString(){
		return "CheckingAccount_Balance :" + getBalance() ;
	}
	@Override
	public double EstimateValue(int month){
		double i;
		
//		i= super.EstimateValue(month);
		i = getBalance();
		i = i+ i*interest*month;
		
		return i;
	}
	@Override
	public double EstimateValue(){
		
		return this.EstimateValue(1);
		
	}
	@Override
	public double credit(double add){
		super.credit(add);
		return getBalance();
	}
	@Override
	public double balance(int num){
		super.balance(num);
		return getBalance();
	}

	@Override
	public void  debit(double amount) throws ArithmeticException{
		
		if(amount <0)throw new ArithmeticException("음수입력!");
		
		if(amount > getBalance()){ //debit함수를 재정의  
		if(amount > getWithdrawableAccount())throw new ArithmeticException("Deibt amount exceeded account balance");
		else{
			  double account3 = getBalance();
			  account3 -= amount;
			  setBalance(account3);
		}
		}
		else{
		super.debit(amount);
		} 
	}
	@Override
	public double getWithdrawableAccount(){
		
		if(getBalance()>0){
			 return credit_limit + getBalance();
		}
		else{
		 double total2 = credit_limit + getBalance();
		 if(total2 < 0){
			 return 0;
		 }
		 else{
			 return total2;
		 }
		}
	}
	@Override
	public double passTime(int moon){
		mon = moon; //처음에 mon에다가 +=라고 했었는데 달수가 저장되는게 아니라 입력한 달수만큼 이자만 붙기때문에 !
		//double pass = getBalance()*Math.pow((1+ loan_interest),mon);  //이것은 복리다 바보야
	double pass=0;
	if(getBalance()<0){
		pass = getBalance()   + getBalance()*loan_interest*mon; 
	
	}
	else if(getBalance()>0){
		pass = getBalance() + getBalance()*mon*interest;
		}
		
		
		setBalance(pass);
		
		return getBalance();
	}
	@Override
	public double passTime(){
	return this.passTime(1);
	
		
	}
	
	
	public boolean isBankrupt(){
		boolean isbank = false;
		
		if(isbank = getWithdrawableAccount()==0){
			return isbank;
		}
		else{
		return isbank;
	}
	}
	public double nextmonth(){
		if(getBalance() >= 0){
			double account4 = getBalance();
			account4 = account4 + account4*interest;
			setBalance(account4);
		}else{
			double account5 = getBalance();
			account5 = account5 + account5*loan_interest;
			setBalance(account5);
		}
		return getBalance();
	}

	
}