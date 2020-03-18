package chapter09;

import java.util.Scanner;

public class CalExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수
		/*int first;
		int second;
		int proc;*/
		// 인스턴스 생성
		CalProc cp = new CalProc();

		// 인자를 받고
		Scanner scan = new Scanner(System.in);
		String [] str = {"첫번째 값을 입력하세요 : 예 100",
				"1 2 3 4 를 선택하세요 	1:+ 2:- 3:* 4:/ ",
				"두번째 값을 입력하세요 : 예 100"};
		String mystr = "";
		
		int []num = new int [3];
		for (int i=0; i<=2; i++) {
			System.out.println(str[i]);
			mystr = scan.next();
			num[i] = Integer.parseInt(mystr);
		}

		/*System.out.println("첫번째 값을 입력하세요 : 예 100");
		String mystr = scan.next();
		first = Integer.parseInt(mystr);

		System.out.println("1 2 3 4 를 선택하세요 	1:+ 2:- 3:* 4:/ ");
		proc = scan.next();

		System.out.println("두번째 값을 입력하세요 : 예 100");
		mystr = scan.next();
		second = Integer.parseInt(mystr);
		*/

		// 대표 메서드 호출
		// cp.agent(first, second, proc);
		cp.agent(num[0], num[2], num[1]);
		
		scan.close();
		

	}

}
