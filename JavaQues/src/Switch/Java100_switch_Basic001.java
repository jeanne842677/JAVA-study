package Switch;

import java.util.Scanner;

//switch 조건무늬 사용법을 예제로 설명해보시오.
//사용자가 자신의 연령대를 입력하면 해당 연령대에 맞는 책을 추천하는 코드를 만들어보시오.
//이 문제는 자바의 switch 조건문을 사용할 수 있는지에 대해서 묻는 문제이다.
public class Java100_switch_Basic001 {
	public static void main(String[] args) {
		
		//[1]: 변수 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		//[2]: 사용자 입력 예외처리
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
			System.out.println("10살 이상만 입력 가능합니다.");
			System.exit(0);

		}
		
		//[3]: switch 조건문
		//변수 조건은 정수형이어야 한다. --> byte, short, int --> 그러나 long타입x --> 그러나 char타입은 o -->'A'
		//break, default 빼먹지 않도록 주의~~!!
		switch(age) {
			case 10:
				System.out.println(age + "대 입니다. 참고서 코너는 A구역 입니다.");
				break;
			case 20:
				System.out.println(age + "대 입니다. 취업서적 코너는 B구역 입니다.");
				break;
			case 30:
				System.out.println(age + "대 입니다. 자기계발 코너는 C구역 입니다.");
				break;
			case 40:
				System.out.println(age + "대 입니다. 재테크 코너는 D구역 입니다.");
				break;
			case 50:
				System.out.println(age + "대 입니다. 재취업 코너는 E구역 입니다.");
				break;
			default:
				System.out.println("60대 이상입니다. 건강/장수 코너는 F구역 입니다.");
				break;
		}
		
	}
}
