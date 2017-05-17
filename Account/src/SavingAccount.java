public class SavingAccount extends Account {
	private double interest;
	private int mon=0;
	
	private double drive;
	public SavingAccount(double account, double interest){
		setBalance(account);
		this.interest= interest;
		this.drive = account;
	}
	public String toString(){
		return "SavingAccount_Balance :" + getBalance();
	}
	@Override
	public double EstimateValue(int month){
		
		double pass =  getBalance()*Math.pow((1+interest),month);
		
		return pass;
	}
	@Override
	public double EstimateValue(){
		return this.EstimateValue(1);
		
	}
	@Override
	public void  debit(double amount) throws ArithmeticException{
		if(mon>=12){
		if(amount > getBalance()) throw new ArithmeticException("Deibt amount exceeded account balance");
		if(amount <0)throw new ArithmeticException("음수입력!");
		super.debit(amount);
		}else throw new ArithmeticException("아직 출금할수 없습니다.");
	}
	@Override
	public double getWithdrawableAccount(){
		if(mon<12){
			return 0;
		}else{
		return getBalance();
		}
	}
	@Override
	public double passTime(int moon){
		this.mon += moon;
		
		
			if(mon >= 12){
		setBalance(drive*Math.pow((1+interest), 12)); //왜 drive를 했냐면 만약 mon이 12이상일때는 계속 account값이 변하기 때문에 처음에 설정해놓은 그값으로 계산.
			}
		return getBalance();
	}
	@Override
	public double passTime(){
		this.passTime(1);
		return getBalance();
	}

}