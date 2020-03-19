package chapter11;

class Pay1 {
	String name = "";
	int pay = 0;
	int comm = 0;
	int tax = 0;

	public Pay1(String name, int pay, int comm) {
		this.name = name;
		this.pay = pay;
		this.comm = comm;
		comm = 100000;
		System.out.println("Pay1생성자 : " + comm);

	}

	public void tax() {
		tax = (int) (pay * 0.05);
	}

	public int earn() {
		int total = (pay + comm) - tax;
		return total;
	}
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아로미";
		int pay = 1500000;
		int comm = 200000;

		System.out.println("comm 변수의 초기값 : " + comm);
		Pay1 p = new Pay1(name, pay, comm);
		System.out.println("main 메소드 comm : " + comm);

	}

}
