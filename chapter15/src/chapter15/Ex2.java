package chapter15;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Ű������� ���� �� ���� ��");

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("s = " + a + " b = " + b);
		
		try {
			System.out.println("a�� b�� ���� �� = "+(a/b));
		}
		catch(Exception e) {
			System.out.println("[���] ���ܹ߻� : "+e.toString());
		}
		finally {
			System.out.println("������ ��ƾ�� ���������� �����մϴ�. ");
		}
	}

}
