package chapter10;


public class Variable {
	String movie = "트로이";
	
	public void show() {
		System.out.println("show 메소드 영역 : "+ movie);
	}
	public void title() {
		String movie = "바람의 전설";
		System.out.println("title 메소드 영역 : "+movie);
		System.out.println("멤버 변수 : "+this.movie);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variable v = new Variable();
		v.show();
		v.title();
	}

}
