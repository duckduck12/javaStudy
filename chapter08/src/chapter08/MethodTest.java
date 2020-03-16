package chapter08;

public class MethodTest {

	String name = "";
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodTest mt = new MethodTest();

		mt.kuk = 100;
		mt.eng = 90;

		mt.tot = mt.kuk + mt.eng;
		mt.avg = mt.tot / 2;

		System.out.println("±¹¾î : " + mt.kuk);
		System.out.println("¿µ¾î : " + mt.eng);
		System.out.println("ÃÑÁ¡ : " + mt.tot);
		System.out.println("Æò±Õ : " + mt.avg);
	}

}
