package chapter09;

class StaticClass2 {
	public static StaticClass2 sc = null;
	int kuk = 100;

	public static StaticClass2 getInstance() {
		if (sc == null) {
			sc = new StaticClass2();
		}
		return sc;
	}
}

public class StaticClassMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass2 sc = new StaticClass2();
		StaticClass2 sc2 = new StaticClass2();  

		System.out.println("sc.hashCode : " + sc.hashCode());
		sc.kuk = 1000;
		System.out.println("sc.kuk : " + sc.kuk);
		System.out.println("sc2.hashCode : " + sc2.hashCode());
		sc2.kuk = 1500;
		System.out.println("sc2.kuk : " + sc2.kuk);
		System.out.println("sc.kuk : " + sc.kuk);

		System.out.println("----------------------------");

		StaticClass2 sc3 = StaticClass2.getInstance();
		StaticClass2 sc4 = StaticClass2.getInstance();

		System.out.println("sc3.hashCode : " + sc3.hashCode());
		sc3.kuk = 2000;
		System.out.println("sc3.kuk : " + sc3.kuk);
		System.out.println("sc4.hashCode : " + sc4.hashCode());
		sc4.kuk = 2500;
		System.out.println("sc4.kuk : " + sc4.kuk);
		System.out.println("sc3.kuk : " + sc3.kuk);
	}

}
