package chapter09;

import java.util.Scanner;

public class CalExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����
		/*int first;
		int second;
		int proc;*/
		// �ν��Ͻ� ����
		CalProc cp = new CalProc();

		// ���ڸ� �ް�
		Scanner scan = new Scanner(System.in);
		String [] str = {"ù��° ���� �Է��ϼ��� : �� 100",
				"1 2 3 4 �� �����ϼ��� 	1:+ 2:- 3:* 4:/ ",
				"�ι�° ���� �Է��ϼ��� : �� 100"};
		String mystr = "";
		
		int []num = new int [3];
		for (int i=0; i<=2; i++) {
			System.out.println(str[i]);
			mystr = scan.next();
			num[i] = Integer.parseInt(mystr);
		}

		/*System.out.println("ù��° ���� �Է��ϼ��� : �� 100");
		String mystr = scan.next();
		first = Integer.parseInt(mystr);

		System.out.println("1 2 3 4 �� �����ϼ��� 	1:+ 2:- 3:* 4:/ ");
		proc = scan.next();

		System.out.println("�ι�° ���� �Է��ϼ��� : �� 100");
		mystr = scan.next();
		second = Integer.parseInt(mystr);
		*/

		// ��ǥ �޼��� ȣ��
		// cp.agent(first, second, proc);
		cp.agent(num[0], num[2], num[1]);
		
		scan.close();
		

	}

}
