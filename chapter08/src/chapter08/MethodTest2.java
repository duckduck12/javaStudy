package chapter08;

public class MethodTest2 {

	String name = "";
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;

	public void calcTot() {
		tot = kuk + eng;
	}

	public void calcAvg() {
		avg = tot / 2.0f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodTest2 mt = new MethodTest2();

		mt.kuk = 100;
		mt.eng = 90;
		mt.calcTot();
		mt.calcAvg();

		System.out.println("���� : " + mt.kuk);
		System.out.println("���� : " + mt.eng);
		System.out.println("���� : " + mt.tot);
		System.out.println("��� : " + mt.avg);
	}

}
