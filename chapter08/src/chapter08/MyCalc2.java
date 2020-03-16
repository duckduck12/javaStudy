package chapter08;

public class MyCalc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc2sub mc = new MyCalc2sub();
				
		int a = mc.scanNum();
		int b = mc.scanNum();		
		mc.add(a, b);

	}

}
