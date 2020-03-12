package chapter04;

public class If4 {
	public static void main(String[] args) {
		int i = 8;

		if (i > 0) {
			if (i > 3) {
				System.out.println("i>0 이고 i>3");
			} else {
				System.out.println("i>0이고 i<=3");
			}
		} else {
			System.out.println("i<=0");
		}
		System.out.println("THE END!!!");
	}
}
