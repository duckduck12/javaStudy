package chapter13;

class TV2 {
	public TV2() {
		System.out.println("TV2");
	}
}

class Movie2 extends TV2 {
	String part = "�ѱ� ��ȭ";
	public Movie2() {
		System.out.println("Movie2");
	}
}

class Action2 extends Movie2 {
	String name = "";
	public Action2() {
		System.out.println("Action2");
	}
}

public class MovieTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action2 act = new Action2();
		act.name = "���ĵ�";
		System.out.println(act.name);

	}

}
