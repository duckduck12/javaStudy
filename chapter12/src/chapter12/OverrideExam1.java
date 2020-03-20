package chapter12;

class OverA{
	void show(String str) {
		System.out.println("상위클래스의 메소드 show(String str) 수행 " + str);
	}
}

class SubOverA extends OverA{
	void show() {
		System.out.println("하위클래스의 메소드 show() 수행 ");
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
