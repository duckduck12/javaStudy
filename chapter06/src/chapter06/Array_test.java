package chapter06;

public class Array_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[5];

		str[0] = "������";
		str[1] = "�ػ�";
		str[2] = "�̿�";
		str[3] = "�ٽø�";
		str[4] = "�۰�";

		for (int i = 0; i < str.length; i++) {
			System.out.println("str[" + i + "] = " + str[i]);
		}
	}

}
