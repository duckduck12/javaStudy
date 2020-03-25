package chapter16;

class RunThread2 extends Thread {
	public RunThread2(String name) {
		super(name);
	}

	public void run() {
		for (int i = 1; i <= 1000; i++) {
			if (i % 50 == 0) {
				System.out.println("Thread [" + getName() + "] : " + i);
				try {
					sleep(1);
					System.out.print("");
				} catch (Exception e) {

				}
			}
		}
	}
}

public class SchedulingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] t = new RunThread[3];

		t[0] = new RunThread("¡Ù");
		t[1] = new RunThread("¡Ú");
		t[2] = new RunThread("¡ß");

		t[0].start();
		t[1].start();
		t[2].start();

	}

}
