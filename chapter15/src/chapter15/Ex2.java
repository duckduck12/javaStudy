package chapter15;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("매개변수로 받은 두 개의 값");

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("s = " + a + " b = " + b);
		
		try {
			System.out.println("a를 b로 나눈 몫 = "+(a/b));
		}
		catch(Exception e) {
			System.out.println("[경고] 예외발생 : "+e.toString());
		}
		finally {
			System.out.println("나머지 루틴을 정상적으로 실행합니다. ");
		}
	}

}
