package chapter15;

class UserException {
	public UserException() {

	}

	public UserException(String message) {
		System.out.println("���Ͽ� ���� ������ ����մϴ�.....");
		System.out.println("�������� : " + message);
	}
}

public class ExceptionError3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("�Ű������� ���� �� ���� ��");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("a = " + a + " b = " + b);
			System.out.println("a�� b�� ���� �� = " + (a / b));
			System.out.println("�������� ��Ȱ�� ����Ǿ����ϴ�. ");
		} catch (Exception e) {
			new UserException(e.toString());
		} finally {
			System.out.println("=========================");
			System.out.println("����ó���� ������ finally���� �����մϴ�. ");
		}
		System.out.println("������ ��ƾ�� ����ó���մϴ�. ");

	}

}
