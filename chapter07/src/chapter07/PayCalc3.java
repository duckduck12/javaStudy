package chapter07;

public class PayCalc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pay3 p1 = new Pay3();
		Pay3 p2 = new Pay3();
		
		p1.bonbong = 2000000;
		p1.name = "¿Õ´«ÀÌ";
		p1.setTex();
		p1.setSilsu();
		p1.prnPay();
		
		System.out.println();
		
		p2.bonbong = 2500000;
		p2.name = "¾Æ·Î¹Ì";
		p2.setTex();
		p2.setSilsu();
		p2.prnPay();
	}

}
