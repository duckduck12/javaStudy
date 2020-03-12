package chapter04;

public class SwitchTest2 {
	public static void main(String[] args) {
		switch (65) {
		case 'A':
			System.out.println("입력된 코드는 A입니다. ");
			break;
		case 'B':
			System.out.println("입력된 코드는 B입니다. ");
			break;
		case 'C':
			System.out.println("입력된 코드는 C입니다. ");
			break;
		case 'D':
			System.out.println("입력된 코드는 D입니다. ");
			break;
		default:
			System.out.println("코드는 A부터 D까지 입력해야 합니다. ㅍ  ");
		}
	}
}
