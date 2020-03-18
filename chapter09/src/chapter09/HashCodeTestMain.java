package chapter09;

class HashCodeTest {
	int kuk = 100;
	int eng = 100;

	public void prn() {
		System.out.println("kuk : " + kuk);
	}
}

class HashCodeTest2 {
	int kuk = 100;
	int eng = 100;

	public void prn() {
		System.out.println("kuk : " + kuk);
	}
}

public class HashCodeTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashCodeTest hct1 = new HashCodeTest();
		HashCodeTest hct2 = new HashCodeTest();
		HashCodeTest2 hct3 = new HashCodeTest2();

		System.out.println("hct1.hashcode : " + hct1.hashCode());
		System.out.println("hct2.hashcode : " + hct2.hashCode());
		System.out.println("hct3.hashcode : " + hct3.hashCode());

	}

}
