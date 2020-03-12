package chapter06;

public class MultiArrayJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = new int[3];
		
		int[][] arr2; 
		arr2 = new int[2][3];
		
		System.out.println("arr1배열의 열의 수 :" + arr1.length+"\n");
		System.out.println("arr배열의 행의 수 :"+arr2.length +"\n");
		System.out.println("arr배열의 0행의 열의 수 :"+arr2[0].length+"\n");
		System.out.println("arr배열의 1행의 열의 수 :"+arr2[1].length +"\n");
	}

}
