package chapter12;

class OverB{
	void show() {
		System.out.println("�θ�Ŭ������ �޼ҵ� show() ���� ");
	}
}

class SubOverB extends OverB{
	void show() {
		System.out.println("�ڽ�Ŭ������ �޼ҵ� show() ���� ");
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
