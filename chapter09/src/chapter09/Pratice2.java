package chapter09;

import java.util.Scanner;

class Calcul {
	
	private	int a; 
	private	int b; 
	private	int tmp;

	Scanner sc = new Scanner(System.in);
	
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setTmp(int tmp) {
		this.tmp = tmp;
	}

	public int scan() {
		int k = sc.nextInt();
		System.out.println("입력된 값 : " + k);
		return k;
	}

	public int add() {
		return a + b;
	}

	public int sub() {
		return a - b;
	}

	public int mul() {
		return a * b;
	}

	public int div() {
		return  a / b;	// 소수점 아래까지 출력하기 위해
	}

	public int select() {
		switch (tmp) {
		case 1:
			return add();
		case 2:
			return sub();
		case 3:
			return mul();
		case 4:
			return div();
		default:
			System.out.println("Error");
			return 0;
		}
	}

	public void prn() {
		System.out.println("계산결과 : " + select());
	}

}

public class Pratice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcul cc = new Calcul();
		
		System.out.println("첫번째 인자를 입력 : ");
		int a = cc.scan();
		cc.setA(a);
		System.out.println("가감승제를 입력 : ");
		int tmp = cc.scan();
		cc.setTmp(tmp);
		System.out.println("두번째 인자를 입력 : ");
		int b = cc.scan();
		cc.setB(b);
		
		cc.prn();
		
		

	}

}
