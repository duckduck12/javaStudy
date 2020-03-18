package chapter09;

class Final {
	int money = 20000;
	final int day = 7;
	final int week = 4;
	final int month = 12;

	public Final() {

	}
}

public class Finalmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final fi = new Final();
		fi.money = 30000;
		System.out.println("1¡÷¿œ øÎµ∑ : " + fi.money * fi.day);

	}

}
