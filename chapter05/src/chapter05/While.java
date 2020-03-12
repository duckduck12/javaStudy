package chapter05;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = -5;
		while (j < 0) {
			System.out.println("번호 :" + j);
			j++;
			if (j == -3)
				break;
		}

		System.out.println("-----END-------");
		System.out.println("While 종료 후 j의 값 : " + j);
	}

}
