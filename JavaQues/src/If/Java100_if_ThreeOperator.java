package If;

import java.util.Scanner;

//���� �����ڸ� �̿��Ͽ� 12�ú��� ������ ����, ũ�� ���ĸ� ����ϵ��� �����غ��ÿ�.
//�� ������ ���Ͽ� �������� ������ ���ؼ� �ƴ����� ���� �����̴�.

public class Java100_if_ThreeOperator {
	public static void main(String[] args) {
		
		//[1]: ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �Է��Ͻÿ�: ");
		int hour = sc.nextInt();
		
		//[2]: ���� ������ �׽�Ʈ --> 10���� �۰ų� ������ 100�� ���Ͻÿ�.
//		int test = hour<=10 ? hour*100 : hour;
//		System.out.println(test);
		
		//[3]: ���� �����ڸ� �̿��Ͽ� 12�ú��� ������ ����, ũ�� ����
		String ampm = hour<12 ? "����" : "����";
		System.out.print("������ " + ampm + "�Դϴ�.");
		
	}
}
