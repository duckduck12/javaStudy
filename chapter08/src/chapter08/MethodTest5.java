package chapter08;

public class MethodTest5 {

	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;

	public MethodTest5(int kuk, int eng) {
		this.kuk = kuk;
		this.eng = eng;
	}

	public void calcTot() {
		tot = kuk + eng;
	}

	public void calcAvg() {
		avg = tot / 2.0f;
	}

	public void prn() {
		System.out.println("���� : " + kuk);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
	}
}
