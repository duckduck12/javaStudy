package chapter11;

class PrivateTest {
	public int kuk = 0;
	public int eng = 0;
	public int sum = 0;

	private void sum() {
		sum = kuk + eng;
		if (sum > 200) {
			System.out.println("������ 200�� �ʰ��߽��ϴ�. ");
			sum = 0;
		} else {
			System.out.println("�հ谡 ���������� ó���ƽ��ϴ�. ");
		}
	}

	public void call_sum() {
		sum();
	}
}

public class PrivateTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateTest pt = new PrivateTest();
		pt.kuk = 90;
		pt.eng = 95;

		pt.call_sum();
		System.out.println("pt.sum() : " + pt.sum);

	}

}
