package chapter06;

public class Array_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[5];

		str[0] = "말미잘";
		str[1] = "해삼";
		str[2] = "미역";
		str[3] = "다시마";
		str[4] = "멍게";

		for (int i = 0; i < str.length; i++) {
			System.out.println("str[" + i + "] = " + str[i]);
		}
	}

}
