package chapter08;

import java.util.Scanner;

public class MyCalc2sub {
	
	Scanner sc = new Scanner(System.in);
	
	public void add(int a, int b) {
		System.out.println("덧셈 결과 : " + (a+b));
	}

	public int scanNum() {
		System.out.println("값 입력 : ");
		int a = sc.nextInt(); 
		System.out.println("입력된 값 : " + a);
		return a;
	}
}
