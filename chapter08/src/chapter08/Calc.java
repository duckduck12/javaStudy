package chapter08;

public class Calc {
	public void add(int kuk, int eng) {
		System.out.println("�հ�" + (kuk + eng));
	}

	public int sub(int kuk, int eng) {
		return kuk - eng;
	}

	public int mul(int kuk, int eng) {
		return kuk * eng;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c = new Calc();
		int a = 100;
		int b = 200;
		c.add(100, 200);

		System.out.println("���� " + c.sub(a, b));
		System.out.println("���� �� " + c.mul(a, b));

	}

}
