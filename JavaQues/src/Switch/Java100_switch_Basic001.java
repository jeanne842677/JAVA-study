package Switch;

import java.util.Scanner;

//switch ���ǹ��� ������ ������ �����غ��ÿ�.
//����ڰ� �ڽ��� ���ɴ븦 �Է��ϸ� �ش� ���ɴ뿡 �´� å�� ��õ�ϴ� �ڵ带 �����ÿ�.
//�� ������ �ڹ��� switch ���ǹ��� ����� �� �ִ����� ���ؼ� ���� �����̴�.
public class Java100_switch_Basic001 {
	public static void main(String[] args) {
		
		//[1]: ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է����ּ��� : ");
		int age = sc.nextInt();
		
		//[2]: ����� �Է� ����ó��
		if(age>9 && age<20) {
			age = 10;
		}else if(age>19 && age<30) {
			age = 20;
		}else if(age>29 && age<40) {
			age = 30;
		}else if(age>39 && age<50) {
			age = 40;
		}else if(age>49 && age<60) {
			age = 50;
		}else if(age<9) {
			System.out.println("10�� �̻� �Է� �����մϴ�.");
			System.exit(0);

		}
		
		//[3]: switch ���ǹ�
		//���� ������ �������̾�� �Ѵ�. --> byte, short, int --> �׷��� longŸ��x --> �׷��� charŸ���� o -->'A'
		//break, default ������ �ʵ��� ����~~!!
		switch(age) {
			case 10:
				System.out.println(age + "�� �Դϴ�. ���� �ڳʴ� A���� �Դϴ�.");
				break;
			case 20:
				System.out.println(age + "�� �Դϴ�. ������� �ڳʴ� B���� �Դϴ�.");
				break;
			case 30:
				System.out.println(age + "�� �Դϴ�. �ڱ��� �ڳʴ� C���� �Դϴ�.");
				break;
			case 40:
				System.out.println(age + "�� �Դϴ�. ����ũ �ڳʴ� D���� �Դϴ�.");
				break;
			case 50:
				System.out.println(age + "�� �Դϴ�. ����� �ڳʴ� E���� �Դϴ�.");
				break;
			default:
				System.out.println("60�� �̻��Դϴ�. �ǰ�/��� �ڳʴ� F���� �Դϴ�.");
				break;
		}
		
	}
}
