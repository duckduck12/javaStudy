package chapter08;

public class MethodTest4 {
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0;

	public MethodTest4(int kuk, int eng) {
		this.kuk = kuk;
		this.eng = eng;
	}

	public void calcTot() {
		tot = kuk + eng;
	}

	public void calcAvg() {
		avg = tot / 2.0f;
	}
	
	public void passOrFail() {
		if(avg>=60) {
			System.out.println("축하합니다. 합격!");
		}
		else {
			System.out.println("죄송합니다. 불합격");
		}
	}

	public void prn() {
		System.out.println("국어 : " + kuk);
		System.out.println("영어 : " + eng);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodTest4 mt = new MethodTest4(80, 70);
		
		mt.calcTot();
		mt.calcAvg();
		mt.prn();
		mt.passOrFail();
	}

}
