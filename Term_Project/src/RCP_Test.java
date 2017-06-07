import java.util.Scanner;
import java.util.Random;

public class RCP_Test {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int usernum;
		int comnum;
		
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

		if(usernum == comnum) {
			System.out.println("비겼습니다!");
		}
		else if((usernum == 0 && comnum == 1) || (usernum == 1 && comnum == 2) || (usernum == 2 && comnum == 0)) {
			System.out.println("패배하였습니다!");
		}
		else if((usernum == 1 && comnum == 0) || (usernum == 2 && comnum == 1) || (usernum == 0 && comnum == 2)) {
			System.out.println("승리하였습니다!");
		}
	}
}
