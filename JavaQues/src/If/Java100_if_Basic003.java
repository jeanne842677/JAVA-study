package If;

//if~else if ~else ���ǹ��� ������ ������ �����غ��ÿ�.
//�̹����� �ڹ��� if~else if~else ���ǹ��� ����� �� �ִ����� ���ؼ� ���� �����̴�.

public class Java100_if_Basic003 {

	public static void main(String[] args) {
		
		//[1]: ��������
		int kor=70, eng=70, math=70;
		int total_score;
		total_score=kor + eng + math;
		
		//[2]: if~else if ~else ���ǹ� ����ϱ�
		if(total_score>=270) {
			System.out.println("����� ��Ż ������" + total_score + "�Դϴ�. �ſ�ſ� ���߾��~");
			System.out.println("�����ؿ�~");
		}else if(total_score>=240){
			System.out.println("����� ��Ż ������" + total_score + "�Դϴ�. ���߾��~");

		}else if(total_score>=210) {
			System.out.println("����� ��Ż ������" + total_score + "�Դϴ�. ����ϼ���~");

		}else {
			System.out.println("����� ��Ż ������" + total_score + "�Դϴ�. ��.........................��.��");

		}

	}

}
