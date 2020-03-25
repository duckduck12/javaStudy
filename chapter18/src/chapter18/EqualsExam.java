package chapter18;

public class EqualsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = "STUDY JAVA";
		String a2 = "Apple";
		String a3 = "APPLE";
		System.out.println("A) ¹®ÀÚ¿­ a1 : "+a1);
		System.out.println("B) ¹®ÀÚ¿­ a2 : "+ a2);
		System.out.println("C) ¹®ÀÚ¿­ a3 : "+ a3);
		System.out.println("D) a2.equals(a3) : "+a2.equals(a3));
		System.out.println("E) a2.equalsIgnoreCase(a3) : "+ a2.equalsIgnoreCase(a3));
		
		if(a2 == "Apple") {
			System.out.println("F) a2´Â AppleÀÔ´Ï´Ù. ");
		}
		
		String objs = new String("¿Õ´«ÀÌ");
		
		if(objs == "¿Õ´«ÀÌ") {
			System.out.println("G) objs´Â ¿Õ´«ÀÌÀÔ´Ï´Ù. ");
		}
		else {
			System.out.println("G) objs´Â ¿Õ´«ÀÌ°¡ ¾Æ´Õ´Ï´Ù. ");
		}
		
		String objs2 = new String("¿Õ´«ÀÌ");
		if(objs.equals("¿Õ´«ÀÌ")) {
			System.out.println("H) equals objs2´Â ¿Õ´«ÀÌÀÔ´Ï´Ù. ");
		}

	}

}
