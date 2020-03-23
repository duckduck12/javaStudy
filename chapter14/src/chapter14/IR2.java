package chapter14;

interface B {
	void display(String s);
}

class D1 implements B {
	String str = " ";

	public void display(String s) {
		str = s;
		System.out.println("Ŭ���� D1 ��ü �̿� : " + s);
	}
}

class D2 implements B {
	String str = " ";

	public void display(String s) {
		str = s;
		System.out.println("Ŭ���� D2 ��ü �̿� : " + s);
	}
}

public class IR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B memo;
		memo = new D1();
		memo.display("����");

		D1 d1 = (D1) memo;
		System.out.println(d1.str);

		memo = new D2();
		memo.display("��ȭ��");

		D2 d2 = (D2) memo;
		System.out.println(d2.str);

	}

}
