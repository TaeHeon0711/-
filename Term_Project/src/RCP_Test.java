

import java.util.Scanner;
import java.util.Random;

public class RCP_Test {
	
	private static int usernum;
	private static int comnum;
	private static int coin = 20;
	private static int getcoin;
	
	static void coinCheck() { //user의 코인을 check하는 method
		
		System.out.println("현재" + coin + "개의 코인을 가지고 있습니다.");
		
		if(coin == 0) {
			System.out.println("현재" + coin + "개의 코인을 가지고 있으므로 게임을 진행 할 수 없습니다.");
			System.out.println("1개의 코인을 드리겠습니다.");
			coin = coin + 1;
		}
		
	}
		
	static void userInput() { //user한테 가위바위보 중 한가지를 입력받는 method
		
		Scanner scanner = new Scanner(System.in);
		
		if(coin > 0) {
			coin = coin - 1;
			System.out.printf("가위바위보에서 낼 것을 선택하세요(0. 가위, 1. 바위, 2. 보) : ");
			usernum = scanner.nextInt();
			if(usernum == 0) {
				System.out.println("당신은 가위를 선택하였습니다.");
			}
			else if(usernum == 1) {
				System.out.println("당신은 바위를 선택하였습니다.");
			}
			else if(usernum == 2) {
				System.out.println("당신은 보를 선택하였습니다.");
			}
			else {
				System.out.println("잘못 된 입력을 하였습니다.");
				return;
			}
		}
	}
	
	static void comOutput () { //computer가 가위바위보 중 무엇을 내는지 출력해주는 method
		
		Random random = new Random();
		
		comnum = random.nextInt(3);
		if(comnum == 0) {
			System.out.println("컴퓨터는 가위를 선택하였습니다.");
		}
		else if(comnum == 1) {
			System.out.println("컴퓨터는 바위를 선택하였습니다.");
		}
		else if(comnum == 2) {
			System.out.println("컴퓨터는 보를 선택하였습니다.");
		}
		
	}
	
	static void getCoin() { //코인을 얻는 method
		
		Random random = new Random();
		
		getcoin = random.nextInt(20) + 1;
		System.out.println(getcoin + "개의 코인을 얻었습니다.");
		coin = coin + getcoin;
		System.out.println("현재" + coin + "개의 코인을 가지고 있습니다.");
		
	}
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
		userInput();
		comOutput();

		if(usernum == comnum) {
			System.out.println("비겼습니다!");
		}
		else if((usernum == 0 && comnum == 1) || (usernum == 1 && comnum == 2) || (usernum == 2 && comnum == 0)) {
			System.out.println("패배하였습니다!");
		}
		else if((usernum == 1 && comnum == 0) || (usernum == 2 && comnum == 1) || (usernum == 0 && comnum == 2)) {
			System.out.println("승리하였습니다!");
			
			getCoin();
		}
	}
}