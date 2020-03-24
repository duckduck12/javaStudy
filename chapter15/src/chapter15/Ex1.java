package chapter15;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("매개변수로 받은 두 개의 값");

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if (b == 0) {
			System.out.println("0으로 나눌 수 없습니다. ");
			System.exit(0);
		}

		System.out.println("a = " + a + " b = " + b);
		System.out.println("a를 b로 나눈 몫 = " + (a / b));
		System.out.println("나눗셈이 원활히 수행되었습니다. ");
	}

}
