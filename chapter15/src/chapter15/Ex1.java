package chapter15;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Ű������� ���� �� ���� ��");

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if (b == 0) {
			System.out.println("0���� ���� �� �����ϴ�. ");
			System.exit(0);
		}

		System.out.println("a = " + a + " b = " + b);
		System.out.println("a�� b�� ���� �� = " + (a / b));
		System.out.println("�������� ��Ȱ�� ����Ǿ����ϴ�. ");
	}

}
