package chapter05;

public class ForPrac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		for(int i = 0; i<5 ; i++) {
			System.out.print("��");
		}
		
		System.out.println();
		
		//2
		for(int i = 0; i<5 ; i++) {
			System.out.println("��");
		}
		
		System.out.println();
		
		//3
		for(int i =0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//4
		for(int i=1; i<=5; i++) {
			/*
			 * ���� ������ 1���� 5���� �����ϴ� ������ �;���. 
			 * �׷��� i������ 1���� 5���� ���� 
			 * �츮�� 5��ſ� i������ ��ü�ϸ� ��. 
			 */
			for(int j=1; j<=i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//5
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//6
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=1; j--) {
				if(j>i) {
					// ���鹮�� ���� : �� - ���� - ù��°
					System.out.print("��");
				}
				else {
					System.out.print("��");
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		//7
		for(int i=5; i>=1; i--) {
			for(int j=5; j>=1; j--) {
				if(j>i) {
					System.out.print("��");
				}
				else {
					System.out.print("��");
				}
				
			}
			System.out.println();
		}
		
		

	}

}
