package chapter18;

public class StringConvert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "�� õ��";
		String s2 = "���� �α�";
		
		System.out.println("s1 HashCode : "+s1.hashCode());
		System.out.println("s2 HashCode : "+s2.hashCode());
		System.out.println("==========================================");
		
		s1+=s2;
		System.out.println("s1 HashCode : "+s1.hashCode());
		System.out.println("s2 HashCode : "+s2.hashCode());
		

	}

}
