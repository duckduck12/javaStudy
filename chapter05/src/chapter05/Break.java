package chapter05;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(i + " " + j);
			}
			System.out.println();
		}

		for (int i = 0; i <= 2; i++) {
			for (int j = 2; j >= 0; j--) {
				if (i == j)
					break;
				System.out.println("i ==" + i + ", j ==" + j);
			}
		}
	}

}
