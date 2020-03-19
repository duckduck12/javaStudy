package chapter11;

class Pay2 {
	String name = "";
	int pay = 0;
	int comm = 0;
	int tax = 0;

	public Pay2(String name, int pay, int comm) {
		this.name = name;
		this.pay = pay;
		this.comm = comm;
	}

	public int tax() {
		tax = (int) (pay * 0.05);
		return tax;
	}

	public int earn() {
		int total = (pay + comm) - tax;
		return total;
	}
}

class PrintPay2 {
	public static void printPay(Pay2 pay) {
		System.out.println("----------------------");
		System.out.println("���� : " + pay.name);
		System.out.println("���� : " + pay.pay);
		System.out.println("���ʽ� : " + pay.comm);
		System.out.println("���� : " + pay.tax);
		System.out.println("�� ���ɾ� : " + pay.earn());
		pay.tax = 5000;
		System.out.println("-----------------------");
		System.out.println("pay.hashCode() : " + pay.hashCode());
	}
}

public class Employee_arg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pay2 p = new Pay2("�մ���", 10000, 1000);

		p.tax();

		PrintPay2.printPay(p);
		PrintPay2.printPay(p);
		System.out.println("p.hashCode() : " + p.hashCode());

	}

}
