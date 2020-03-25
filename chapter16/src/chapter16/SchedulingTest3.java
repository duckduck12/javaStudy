package chapter16;

class RunThread3 extends Thread {
	public RunThread3(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i <= 1000; i++) {
			if (i % 50 == 0) {
				System.out.println("Thread[" + getName() + "] : " + i);
			}
		}
	}
}

public class SchedulingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] t = new RunThread3[3];

		t[0] = new RunThread3("¡Ù");
		t[1] = new RunThread3("¡Ý");
		t[2] = new RunThread3("¡Ü");

		t[0].start();
		t[0].setPriority(10);

		t[1].start();
		t[1].setPriority(5);

		t[2].start();
		t[2].setPriority(1);

		System.out.println("Thread.MAX_PRIORITY : " + Thread.MAX_PRIORITY);
		System.out.println("Thread.NORM_PRIORITY : " + Thread.NORM_PRIORITY);
		System.out.println("Thread.MIN_PRIORITY : " + Thread.MIN_PRIORITY);

		System.out.println("t[0] : " + t[0].getPriority());
		System.out.println("t[1] : " + t[1].getPriority());
		System.out.println("t[2] : " + t[2].getPriority());
	}

}
