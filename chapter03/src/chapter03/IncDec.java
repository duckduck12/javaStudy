package chapter03;

public class IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		int y = x++;

		System.out.println("x의 값은 " + x);
		System.out.println("y의 값은 " + y);

		x = 1;
		int z = ++x;

		System.out.println("x의 값은 " + x);
		System.out.println("z의 값은 " + z);

		x = 1;
		x++;
		z = x;
		System.out.println("-----------------------");
		System.out.println("x의 값은 " + x);
		System.out.println("z의 값은 " + z);
	}

}
