package chapter18;

public class StringBufferExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1 = new StringBuffer("Hello JAVA");
		StringBuffer str2 = new StringBuffer("�ȳ��ϼ��� �ڹ�");

		System.out.println("����1 ���ڿ� ���� ==>" + str1);
		System.out.println("����1 ���ڿ� ���� ==> " + str1.length());
		System.out.println("����1 �Ҵ�� �뷮 ==> " + str1.capacity());

		System.out.println("����2 ���ڿ� ���� ==>" + str2);
		System.out.println("����2 ���ڿ� ���� ==> " + str2.length());
		System.out.println("����2 �Ҵ�� �뷮 ==> " + str2.capacity());

	}

}
