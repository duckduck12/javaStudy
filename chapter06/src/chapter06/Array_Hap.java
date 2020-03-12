package chapter06;

public class Array_Hap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] su = {1,2,3,4,5,6,7,8,9,10};
		
		int i, hap = 0;
		
		for(i=0; i<10; i++) {
			hap+=su[i];
		}
		System.out.println("1부터 10까지의 합 =>"+hap);
	}

}
