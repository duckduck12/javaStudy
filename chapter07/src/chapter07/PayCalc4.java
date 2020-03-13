package chapter07;

public class PayCalc4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pay4 p1 = new Pay4();
		Pay4 p2 = new Pay4();

		p1.bonbong = 2000000;
		p1.name = "¿Õ´«ÀÌ";
		p1.setTex();
		p1.setSilsu();
		p1.prnPay();

		System.out.println("------------------");

		p2.bonbong = 2500000;
		p2.name = "¾Æ·Î¹Ì";
		p2.setTex();
		p2.setSilsu();
		p2.prnPay();
	}

}
