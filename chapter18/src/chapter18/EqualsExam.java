package chapter18;

public class EqualsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = "STUDY JAVA";
		String a2 = "Apple";
		String a3 = "APPLE";
		System.out.println("A) ���ڿ� a1 : "+a1);
		System.out.println("B) ���ڿ� a2 : "+ a2);
		System.out.println("C) ���ڿ� a3 : "+ a3);
		System.out.println("D) a2.equals(a3) : "+a2.equals(a3));
		System.out.println("E) a2.equalsIgnoreCase(a3) : "+ a2.equalsIgnoreCase(a3));
		
		if(a2 == "Apple") {
			System.out.println("F) a2�� Apple�Դϴ�. ");
		}
		
		String objs = new String("�մ���");
		
		if(objs == "�մ���") {
			System.out.println("G) objs�� �մ����Դϴ�. ");
		}
		else {
			System.out.println("G) objs�� �մ��̰� �ƴմϴ�. ");
		}
		
		String objs2 = new String("�մ���");
		if(objs.equals("�մ���")) {
			System.out.println("H) equals objs2�� �մ����Դϴ�. ");
		}

	}

}
