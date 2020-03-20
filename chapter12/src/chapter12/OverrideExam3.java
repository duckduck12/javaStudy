package chapter12;

class OverC {
	int show(int k) {
		return k;
	}
}

class SubOverC extends OverC {
	int show(int i) {
		return i * 1;
	}
}

public class OverrideExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverC ob = new OverC();
		int i = ob.show(10);

		SubOverC over = new SubOverC();
		float j = over.show(10);

		System.out.println("i : " + i);
		System.out.println("j : " + j);

	}

}
