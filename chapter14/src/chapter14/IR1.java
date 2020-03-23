package chapter14;

interface A {
	void display(String s);
}

class C1 implements A {
	public void display(String s) {
		System.out.println("☆클래스 C1 객체 이용 : " + s);
	}
}

class C2 implements A {
	public void display(String s) {
		System.out.println("★클래스 C2 객체 이용 : " + s);
	}
}

class C3 implements A {
	public void display(String s) {
		System.out.println("♣클래스 C3 객체 이용 : " + s);
	}
	
	public int getInt() {
		return 1000;
	}
}

public class IR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A memo;
		
		memo = new C1();
		memo.display("경기도 - 북한산");
		
		memo = new C2();
		memo.display("강원도 - 설악산");
		
		memo = new C3();
		memo.display("강화도 - 마니산");
		

	}

}
