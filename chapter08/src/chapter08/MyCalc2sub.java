package chapter08;

import java.util.Scanner;

public class MyCalc2sub {
	
	Scanner sc = new Scanner(System.in);
	
	public void add(int a, int b) {
		System.out.println("���� ��� : " + (a+b));
	}

	public int scanNum() {
		System.out.println("�� �Է� : ");
		int a = sc.nextInt(); 
		System.out.println("�Էµ� �� : " + a);
		return a;
	}
}
