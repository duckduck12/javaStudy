package chapter18;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "a�浿";
		String s2 = "b�浿";

		System.out.println(s1.compareTo(s2));

		if (s1.compareTo(s2) < 0) {
			System.out.println("s1�� ���� ���ڿ��Դϴ�. ");
		}
		if (s1.compareTo(s2) == 0) {
			System.out.println("�� ���ڿ��� ���� ���ڿ��Դϴ�. ");
		}
		if (s1.compareTo(s2) > 0) {
			System.out.println("s1�� ū ���ڿ��Դϴ�. ");
		}

	}

}
