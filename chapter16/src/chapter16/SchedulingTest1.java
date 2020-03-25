package chapter16;

class  RunThread extends Thread{
	public RunThread (String name) {
		super(name);
	}
	public void run() {
		for(int i=1; i<=500; i++) {
			if(i%50==0) {
				System.out.println("Thread ["+getName()+"] : "+i);
			}
		}
	}
}

public class SchedulingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] t = new RunThread[2];
		
		t[0] = new RunThread("ONE");
		t[1] = new RunThread("TWO");
		
		t[0].start();
		t[1].start();
		

	}

}
