package chapter18;

public class StringbufferExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1 = new StringBuffer("�١��ڹ�");

		System.out.println("���ۿ� ����ִ� ���� ==> " + str1);
		System.out.println("���ڿ� �����ֱ� ==> " + str1.insert(2, "GOOD"));
		System.out.println("������ 5��° ���� ==> " + str1.charAt(4));

		str1.setCharAt(0, '��');
		System.out.println("0��° ���� '��'�� ���� ==> " + str1);

		str1.setLength(6);
		System.out.println("str1.setLength(6) ���� ��");

		System.out.println("������ ���ο� �� ==> " + str1);
		System.out.println("���ڿ��� ��������ϱ� ==> " + str1.reverse());
		System.out.println("������ ���� ==> " + str1.length());
		System.out.println("�Ҵ�� �뷮 ==> " + str1.capacity());

	}

}
