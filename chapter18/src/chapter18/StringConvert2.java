package chapter18;

public class StringConvert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer("�� õ�� ");

		System.out.println("s1 hashcode : " + s1.hashCode());
		System.out.println("----------------------------------");

		s1.append("���� �α�");
		System.out.println(s1);
		System.out.println("s1 hashcode : " + s1.hashCode());

	}

}
