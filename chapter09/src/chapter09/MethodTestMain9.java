package chapter09;

class MethodTest {
	private int kuk = 0;
	private int eng = 0;
	private int tot = 0;
	private float avg = 0.0f;

	public MethodTest() {

	}

	public int getTot() {
		return tot;
	}

	public float getAvg() {
		int avg_round = 0;
		avg_round = (int) (avg + 0.5);
		return avg_round;
	}

	public void setKuk(int kuk) {
		this.kuk = kuk;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void calcTot() {
		tot = kuk + eng;
	}

	public void calcAvg() {
		avg = tot / 2.0f;
	}

	public void prn() {
		System.out.println("±¹¾î : " + kuk);
		System.out.println("¿µ¾î : " + eng);
		System.out.println("ÃÑÁ¡ : " + tot);
		System.out.println("Æò±Õ : " + avg);
	}

}

public class MethodTestMain9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest mt = new MethodTest();

		mt.setKuk(95);
		mt.setEng(80);
		mt.calcTot();
		mt.calcAvg();
		System.out.println("ÃÑÁ¡ : " + mt.getTot());
		System.out.println("Æò±Õ : " + mt.getAvg());

	}

}
