package chapter05;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if ((i % 2) == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 100까지 짝수의 합 :" + sum);

		int sum2 = 0;

		for (int i = 0; i <= 100; i += 2) {
			sum2 += i;
		}
		System.out.println(sum2);

	}

}
