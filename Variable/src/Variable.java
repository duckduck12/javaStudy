
public class Variable {

	public static void main(String[] args) {

		// ���� : ���α׷� ���� �� �߻��ϴ� �������� �ӽ� ����
		// ������ ��� �׸�
		// �����ʹ� ���� ����

		// ���� �����
		// �ڷ��� (�׸� ����) ������ (�׸� �̸�);

		// ������ ���ǻ���
		// �����ο쳪 ��� ����
		/*
		 * �ڹ� ������ X ���ڷ� ����X �ҹ��� ����O Ư�����ڴ� _�� ���� ��, '��Ÿü'(�߰��߰� �빮��) �Ǵ� _
		 */

		/*
		 * �ڷ��� int > ����(�Ҽ����� ���� ����)
		 * 
		 */
		int myAge; // myAge ��� �̸��� �׸��� ����.
		myAge = 20; // myAge ��� �׸��� 20�� ����.

		System.out.println("My age is : ");
		System.out.println(myAge);
		
		// �ڵ��� ������ ���� (1000$)
		int phoneCost = 1000;	// �׸��� ����� 1000����
		// ��������� �ʱ�ȭ���� �ѹ��� ok	
				
		System.out.println("�� ���� : " + phoneCost + "$");
		
		System.out.print("�� ���� : ");
		System.out.print(phoneCost);
		System.out.println("$");
		
		// Self Test �Ź߻����� 	( 260mm
		// �� �Ź� �������  ex�̴�. 
		
		int size = 240; 
		System.out.println("�� �Ź� ������� "+ size + "mm �̴�. ");
		// size(������)��  ��� �Է����� ����, s+ ctrl + space �� ����� �� 
		
		size = 280; // int size = 280; ->  �̰��� �ȵȴ�. 
		System.out.println(size);
	}
}
