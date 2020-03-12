package chapter06;

public class Array_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = new char[10];

		c[0] = 'S';
		c[1] = 'N';
		c[2] = 'O';
		c[3] = 'W';
		c[4] = '♣';

		int i;

		System.out.println("배열의 길이 : " + c.length);

		for (i = 0; i < c.length; i++) {
			System.out.println(".");
			System.out.println(c[i]);
		}

		System.out.println();
		c[4] = '★';
		for (i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}

}
