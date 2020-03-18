package chapter09;

class StaticClass {
	public static StaticClass sc = null;
	int kuk = 100;
}

public class StaticClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass sc = new StaticClass();
		StaticClass sc2 = new StaticClass();

		System.out.println("sc.hashCode : " + sc.hashCode());
		System.out.println("sc.kuk : " + sc.kuk);
		System.out.println("sc2.hashCode : " + sc2.hashCode());
		System.out.println("sc2.kuk : " + sc2.kuk);

	}

}
