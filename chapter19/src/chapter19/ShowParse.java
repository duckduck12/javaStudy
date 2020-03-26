package chapter19;

import java.util.StringTokenizer;

public class ShowParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("개구리,왕눈이,아로미,투투", ",");

		System.out.println("파생할 문자열의 수는 총 " + st.countTokens() + "개");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
