package chapter18;

public class SystemExam {
	public static void execTime() {
		long start, end;
		float time;

		start = System.currentTimeMillis();
		System.out.println("현재시간 : " + start);

		SystemExam.testMethod();

		end = System.currentTimeMillis();
		System.out.println("반복 종료 시간 : " + end);
		time = (end - start) / 1000.0f;

		System.out.println("end-start : " + (end - start));
		System.out.println("반복에 소요된 시간 : " + time + "초");
	}

	public static void testMethod() {
		System.out.println("100,000회의 Loop를 반복 시작 ");
		for (int i = 0; i < 100000; i++) {
			String str = new String("개구리 왕눈이");
			System.out.println(str);
		}

		System.out.println("100,000회의 반복 종료");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemExam.execTime();

	}

}
