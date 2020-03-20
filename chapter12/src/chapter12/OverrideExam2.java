package chapter12;

class OverB{
	void show() {
		System.out.println("부모클래스의 메소드 show() 수행 ");
	}
}

class SubOverB extends OverB{
	void show() {
		System.out.println("자식클래스의 메소드 show() 수행 ");
	}
}

public class OverrideExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverB ob = new OverB();
		ob.show();
		
		SubOverB over = new SubOverB();
		over.show();

	}

}
