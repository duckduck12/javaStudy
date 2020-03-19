package chapter11;

class PrivateTestVari {
	private int kuk = 0;

	public void setKuk(int kuk) {
		if (kuk > 100) {
			System.out.println("kuk값을 다시 입력해 주세요. ");
		} else {
			this.kuk = kuk;
		}
	}

	public int getKuk() {
		return this.kuk;
	}
}

public class PrivateTestVariMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateTestVari ptv = new PrivateTestVari();
		ptv.setKuk(100);
		int kuk = ptv.getKuk();
		System.out.println(kuk);

	}

}
