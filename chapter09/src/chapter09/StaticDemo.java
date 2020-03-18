package chapter09;

class Box{
	int cnt = 0;
	static long boxID = 0;
	
	public Box() {
		boxID = boxID+1;
		cnt = cnt+1;
		System.out.println("cnt : " + cnt);
		System.out.println("boxID : "+ boxID);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box mybox1 = new Box();
		Box mybox2 = new Box();
		Box mybox3 = new Box();
		Box mybox4 = new Box();
		
	}

}
