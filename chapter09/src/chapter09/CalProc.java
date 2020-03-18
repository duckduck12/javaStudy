package chapter09;

public class CalProc {
	private void add(int first, int second) {
		System.out.println("결과는 : " + (first + second));
	}

	private void sub(int first, int second) {
		System.out.println("결과는 : " + (first - second));
	}

	private void mul(int first, int second) {
		System.out.println("결과는 : " + (first * second));
	}

	private void div(int first, int second) {
		System.out.println("결과는 : " + ((float) first / second));
	}

	// 대표 메서드
	public void agent(int first, int second, int proc) {
		switch (proc) {
		case 1:
			add(first, second);
			break;
		case 2:
			sub(first, second);
			break;
		case 3:
			mul(first, second);
			break;
		case 4:
			div(first, second);
			break;
		}
	}

}
