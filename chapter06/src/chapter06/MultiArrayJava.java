package chapter06;

public class MultiArrayJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = new int[3];
		
		int[][] arr2; 
		arr2 = new int[2][3];
		
		System.out.println("arr1�迭�� ���� �� :" + arr1.length+"\n");
		System.out.println("arr�迭�� ���� �� :"+arr2.length +"\n");
		System.out.println("arr�迭�� 0���� ���� �� :"+arr2[0].length+"\n");
		System.out.println("arr�迭�� 1���� ���� �� :"+arr2[1].length +"\n");
	}

}
