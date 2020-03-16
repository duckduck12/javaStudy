package chapter08;

public class MethodTestMain7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest7 mt = new MethodTest7(90, 90);

		mt.calcTot();
		mt.calcAvg();
		mt.prn();

		mt.setKuk(70);
		mt.setEng(80);
		mt.calcTot();
		mt.calcAvg();
		System.out.println("ÃÑÁ¡ : " + mt.getTot());
		System.out.println("Æò±Õ : " + mt.getAvg());

	}

}
