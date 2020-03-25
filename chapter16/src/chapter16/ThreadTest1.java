package chapter16;

class MyThread extends Thread {
	private String name;
	private int num;

	public MyThread(String a, int b) {
		name = a;
		num = b;
	}

	public void run() {
		for (int i = 0; i < num; i++) {
			System.out.println(name + ":" + i);
		}
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread("first", 1000);
		MyThread t2 = new MyThread("second", 1000);
		MyThread t3 = new MyThread("third", 1000);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
