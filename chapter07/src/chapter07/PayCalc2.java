package chapter07;

public class PayCalc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pay2 p1 = new Pay2();
		Pay2 p2 = new Pay2();
		
		p1.bonbong = 2000000;
		p1.name = "왕눈이";
		p1.tex = (int) (p1.bonbong * 0.045 + 0.5);
		p1.silsu = p1.bonbong - p1.tex;

		p2.bonbong = 2500000;
		p2.name = "아로미";
		p2.tex = (int) (p2.bonbong * 0.045 + 0.5);
		p2.silsu = p2.bonbong - p2.tex;
		
		
		System.out.println("성명 : " + p1.name);
		System.out.println("본봉 : " + p1.bonbong);
		System.out.println("세금 : " + p1.tex);
		System.out.println("실수령액 : " + p1.silsu);
		System.out.println("");
		
		System.out.println("성명 : " + p2.name);
		System.out.println("본봉 : " + p2.bonbong);
		System.out.println("세금 : " + p2.tex);
		System.out.println("실수령액 : " + p2.silsu);
		
	}

}
