package chapter13;

class TV{
	public TV() {
		System.out.println("TV");
	}
}

class Movie extends TV{
	String part = "";
	public Movie() {
		
	}
	public Movie(String part) {
		this.part = part;
		System.out.println("Movie");
	}
}

class Comedy extends Movie{
	String time = "";
	String name = "";
	
	public Comedy() {
		
	}
	public Comedy(String time, String name, String part) {
		super(part);
		this.time = time;
		this.name = name;
		System.out.println("Comedy");
	}
}

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comedy com = new Comedy("21:00", "���ĵ�", "�ѱ���ȭ");
		System.out.println(com.time);
		System.out.println(com.name);
		System.out.println(com.part);
		
		Comedy com2 = new Comedy();
		com2.time = "17:00";
		com2.name = "������ ����";
		com2.part = "�ѱ� ��ȭ";
		System.out.println(com2.time);
		System.out.println(com2.name);
		System.out.println(com2.part);

	}

}
