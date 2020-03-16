package chapter08;

import java.util.Scanner;

public class MyCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("값을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		// 프로그램이 실행되고 있는 도중에 값을 콘솔로부터 입력받는 것 
		String mystr = scan.next();
		System.out.println("입력된 값은 : " + mystr);
		
		System.out.println("값을 입력하세요 : ");
		String mystr2 = scan.next();
		System.out.println("입력된 값은 : " + mystr2);

	}

}
