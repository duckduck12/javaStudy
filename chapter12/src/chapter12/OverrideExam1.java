package chapter12;

class OverA{
	void show(String str) {
		System.out.println("����Ŭ������ �޼ҵ� show(String str) ���� " + str);
	}
}

class SubOverA extends OverA{
	void show() {
		System.out.println("����Ŭ������ �޼ҵ� show() ���� ");
	}
}
public class OverrideExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubOverA over = new SubOverA();
		over.show("STUDY KOREA");
		over.show();
		
	}

}
