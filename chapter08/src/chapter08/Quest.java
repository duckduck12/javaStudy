package chapter08;

import java.util.Scanner;

public class Quest {

	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quest mc = new Quest();
		Scanner scan = new Scanner(System.in);
		int[] num = new int[2];

		for (int i = 0; i < 2; i++) {
			System.out.println((i + 1) + "번째 값을 입력하세요 :");
			String mystr = scan.next();
			num[i] = Integer.parseInt(mystr);
		}

		int result = mc.add(num[0], num[1]);
		System.out.println("덧셈 결과는 : " + result);
		
		scan.close();
	}

}

/*
 * 1. 두 개의 값을 입력 받아서 
 * 2. 두 값을 더한 후 결과를 리턴하는 함수 
 * 3. 
 */
