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
			System.out.println((i + 1) + "��° ���� �Է��ϼ��� :");
			String mystr = scan.next();
			num[i] = Integer.parseInt(mystr);
		}

		int result = mc.add(num[0], num[1]);
		System.out.println("���� ����� : " + result);
		
		scan.close();
	}

}

/*
 * 1. �� ���� ���� �Է� �޾Ƽ� 
 * 2. �� ���� ���� �� ����� �����ϴ� �Լ� 
 * 3. 
 */
