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
			System.out.println("�����մϴ�. �հ�!");
		}
		else {
			System.out.println("�˼��մϴ�. ���հ�");
		}
	}

	public void prn() {
		System.out.println("���� : " + kuk);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
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
