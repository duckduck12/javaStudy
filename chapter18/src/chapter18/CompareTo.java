package chapter18;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "a길동";
		String s2 = "b길동";

		System.out.println(s1.compareTo(s2));

		if (s1.compareTo(s2) < 0) {
			System.out.println("s1이 작은 문자열입니다. ");
		}
		if (s1.compareTo(s2) == 0) {
			System.out.println("두 문자열은 같은 문자열입니다. ");
		}
		if (s1.compareTo(s2) > 0) {
			System.out.println("s1이 큰 문자열입니다. ");
		}

	}

}
