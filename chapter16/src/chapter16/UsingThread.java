package chapter16;

class IncThread extends Thread {
	MainData m;
	int toAdd;
	String name;

	public IncThread(MainData md, int to, String n) {
		m = md;
		toAdd = to;
		name = n;
		System.out.println("Inc Thread m.hashCode() : " + m.hashCode());
	}

	public void run() {
		for (int i = 0; i < toAdd; i++) {
			try {
				sleep(5);
			} catch (Exception e) {

			}
			m.up(name);
		}
	}
}

class DecThread extends Thread {
	MainData m;
	int toAdd;
	String name;

	public DecThread(MainData md, int to, String n) {
		m = md;
		toAdd = to;
		name = n;
		System.out.println("DecThread m.hashCode() : " + m.hashCode());
	}

	public void run() {
		for (int i = 0; i < toAdd; i++) {
			try {

			} catch (Exception e) {

			}
			m.down(name);
		}
	}
}

class MainData {
	Integer data;

	public void up(String name) {
		synchronized (data) {
			System.out.print(name + "��" + data);
			data = new Integer(data.intValue() + 1);
			System.out.println("�� " + data + "�� ������Ŵ");
		}
	}

	public void down(String name) {
		synchronized (data) {
			System.out.print(name + "��" + data);
			data = new Integer(data.intValue() - 1);
			System.out.println("�� " + data + "�� ���ҽ�Ŵ ");
		}
	}
}

public class UsingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainData m = new MainData();

		m.data = new Integer(0);
		System.out.println("Using Thread m.hashCode() : " + m.hashCode());

		IncThread t1;
		DecThread t2;

		t1 = new IncThread(m, 2, "����������");
		t2 = new DecThread(m, 3, "���ҽ�����");

		t1.start();
		t2.start();

	}

}
