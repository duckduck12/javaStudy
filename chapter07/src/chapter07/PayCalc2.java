package chapter07;

public class PayCalc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pay2 p1 = new Pay2();
		Pay2 p2 = new Pay2();
		
		p1.bonbong = 2000000;
		p1.name = "�մ���";
		p1.tex = (int) (p1.bonbong * 0.045 + 0.5);
		p1.silsu = p1.bonbong - p1.tex;

		p2.bonbong = 2500000;
		p2.name = "�Ʒι�";
		p2.tex = (int) (p2.bonbong * 0.045 + 0.5);
		p2.silsu = p2.bonbong - p2.tex;
		
		
		System.out.println("���� : " + p1.name);
		System.out.println("���� : " + p1.bonbong);
		System.out.println("���� : " + p1.tex);
		System.out.println("�Ǽ��ɾ� : " + p1.silsu);
		System.out.println("");
		
		System.out.println("���� : " + p2.name);
		System.out.println("���� : " + p2.bonbong);
		System.out.println("���� : " + p2.tex);
		System.out.println("�Ǽ��ɾ� : " + p2.silsu);
		
	}

}
