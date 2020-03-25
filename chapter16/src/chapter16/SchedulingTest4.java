package chapter16;

class RunThread4 extends Thread {
	public RunThread4(String name) {
		super(name);
	}

	public void run() {
		for (int i = 1; i <= 300; i++) {
			if (i % 50 == 0) {
				System.out.println("Thread [" + getName() + "] : " + i);
				try {
					sleep(1);
					System.out.print("");
				} catch (InterruptedException e) {

				}
			}
		}
	}
}

public class SchedulingTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] t = new RunThread4[3];

		t[0] = new RunThread4("¡Ù");
		t[1] = new RunThread4("¡Ý");
		t[2] = new RunThread4("¡Ü");

		t[0].start();
		t[0].setPriority(10);

		t[1].start();
		t[1].setPriority(5);

		t[2].start();
		t[2].setPriority(1);


	}

}
