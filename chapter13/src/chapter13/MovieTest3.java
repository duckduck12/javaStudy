package chapter13;

class TV3 {
	public TV3() {
		System.out.println("TV3");
	}
}

class Movie3 extends TV3 {

	String part = "";

	public Movie3(String part) {
		this.part = part;
		System.out.println("Movie3");
	}
}

class Comedy3 extends Movie3 {
	String time = "";
	String name = "";

	public Comedy3(String time, String name, String part) {
		super(part);
		this.time = time;
		this.name = name;
	}
}

public class MovieTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comedy3 com = new Comedy3("21:00", "마파도", "한국영화");
		System.out.println(com.time);
		System.out.println(com.name);
		System.out.println(com.part);

	}

}
