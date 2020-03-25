package chapter18;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abs : " + Math.abs(-100));
		System.out.println("ceil : " + Math.ceil(1.1));
		System.out.println("floor : " + Math.floor(1.9));
		System.out.println("(int)(a+0.5f) : " + (int) (10.5 + 0.5f));
		System.out.println("round(10.4) : " + Math.round(10.4));
		System.out.println("round(10.5) : " + Math.round(10.5));
		System.out.println("round(10.6) : " + Math.round(10.6));

		System.out.println("--------------------------------------");

		double d;
		for (int i = 0; i <= 4; i++) {
			d = Math.random();

			int min = 100;
			int max = 105;

			System.out.println(((int) d * ((max - min) + 1) + min));
		}

	}

}
