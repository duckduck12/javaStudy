package chapter03;

public class Variable_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =1234;
		int j = 5678;
		int hap = 0;
		
		hap = i+j;
		
		System.out.println("변수를 이용한 예제");
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("hap = "+hap);
		
		i=i+j;
		System.out.println("i = i+j => "+i);
	}

}
