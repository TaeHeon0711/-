import java.util.Scanner;
import java.util.Random;

public class RCP_Test {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int usernum;
		int comnum;
		
		System.out.printf("�������������� �� ���� �����ϼ���(0. ����, 1. ����, 2. ��) : ");
		usernum = scanner.nextInt();
		if(usernum == 0) {
			System.out.println("����� ������ �����Ͽ����ϴ�.");
		}
		else if(usernum == 1) {
			System.out.println("����� ������ �����Ͽ����ϴ�.");
		}
		else if(usernum == 2) {
			System.out.println("����� ���� �����Ͽ����ϴ�.");
		}
		else {
			System.out.println("�߸� �� �Է��� �Ͽ����ϴ�.");
			return;
		}
		
		comnum = random.nextInt(3);
		if(comnum == 0) {
			System.out.println("��ǻ�ʹ� ������ �����Ͽ����ϴ�.");
		}
		else if(comnum == 1) {
			System.out.println("��ǻ�ʹ� ������ �����Ͽ����ϴ�.");
		}
		else if(comnum == 2) {
			System.out.println("��ǻ�ʹ� ���� �����Ͽ����ϴ�.");
		}

		if(usernum == comnum) {
			System.out.println("�����ϴ�!");
		}
		else if((usernum == 0 && comnum == 1) || (usernum == 1 && comnum == 2) || (usernum == 2 && comnum == 0)) {
			System.out.println("�й��Ͽ����ϴ�!");
		}
		else if((usernum == 1 && comnum == 0) || (usernum == 2 && comnum == 1) || (usernum == 0 && comnum == 2)) {
			System.out.println("�¸��Ͽ����ϴ�!");
		}
	}
}
