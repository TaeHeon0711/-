public class ValuableTest {
	public static void main(String[]args){
		Valuable[] objectList = new Valuable[4];
		Human human = new Human("Mark", 20);
		Car car = new Car("MyCar",5000);
		CheckingAccount checkingaccount = new CheckingAccount(100,50,0.01,0.07);
		SavingAccount savingaccount = new SavingAccount(100,0.05);
		objectList[0] = checkingaccount;
		objectList[1] = savingaccount;
		objectList[3] = car;
		objectList[2] = human;
		
		for(int i=0 ; i<4;i++){
			System.out.printf("%s\n",objectList[i].toString());
			System.out.printf("6 month later Valuable : %.2f\n\n", objectList[i].EstimateValue(6));
		}
	}
}