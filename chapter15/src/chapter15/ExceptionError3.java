package chapter15;

class UserException {
	public UserException() {

	}

	public UserException(String message) {
		System.out.println("파일에 에러 내역을 기록합니다.....");
		System.out.println("에러원인 : " + message);
	}
}

public class ExceptionError3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("매개변수로 받은 두 개의 값");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("a = " + a + " b = " + b);
			System.out.println("a를 b로 나눈 몫 = " + (a / b));
			System.out.println("나눗셈이 원활히 수행되었습니다. ");
		} catch (Exception e) {
			new UserException(e.toString());
		} finally {
			System.out.println("=========================");
			System.out.println("예외처리를 끝내고 finally블럭을 수행합니다. ");
		}
		System.out.println("나머지 루틴을 정상처리합니다. ");

	}

}
