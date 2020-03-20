package chapter13;

class TV4 {
	public TV4() {
		System.out.println("TV4");
	}
}

class Movie4 {
	String part = "";

	public Movie4() {

	}

	public Movie4(String part) {
		this.part = part;
		System.out.println("Movie4");
	}
}

class Comedy4 extends Movie4 {
	String time = "";
	String name = "";

	public Comedy4() {

	}

	public Comedy4(String time, String name, String part) {
		super(part);
		this.time = time;
		this.name = name;
		System.out.println("Comedy4");
	}
}

public class MovieTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comedy4 com = new Comedy4("21:00", "마파도", "한국영화");
		System.out.println(com.time);
		System.out.println(com.name);
		System.out.println(com.part);

		Comedy4 com2 = new Comedy4();
		com2.name = "가문의 영광";
		System.out.println(com2.name);

	}

}
