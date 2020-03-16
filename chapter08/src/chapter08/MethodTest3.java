package chapter08;

public class MethodTest3 {
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;

	public MethodTest3(int kuk, int eng) {
		this.kuk = kuk;
		this.eng = eng;
	}

	public void calcTot() {
		tot = kuk + eng;
	}

	public void calcAvg() {
		avg = tot / 2.0f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodTest3 mt = new MethodTest3(100, 90);

		mt.calcTot();
		mt.calcAvg();

		System.out.println("±¹¾î : " + mt.kuk);
		System.out.println("¿µ¾î : " + mt.eng);
		System.out.println("ÃÑÁ¡ : " + mt.tot);
		System.out.println("Æò±Õ : " + mt.avg);
	}

}
