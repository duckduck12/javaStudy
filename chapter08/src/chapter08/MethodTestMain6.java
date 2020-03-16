package chapter08;

public class MethodTestMain6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodTest6 mt = new MethodTest6(90, 90);

		mt.calcTot();
		mt.calcAvg();
		mt.prn();

		int tot = mt.getTot();
		float avg = mt.getAvg();

		System.out.println("ÃÑÁ¡ : " + tot);
		System.out.println("Æò±Õ : " + avg);
	}

}
