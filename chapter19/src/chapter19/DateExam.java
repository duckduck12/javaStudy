package chapter19;

import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentDate = new Date();
		System.out.println("���� �ý��� ��¥�� " + currentDate + "�Դϴ�. ");

		Date mybirthday = new Date(81, 0, 20);
		System.out.println("���� ������ " + mybirthday + "�Դϴ�. ");

		System.out.println("������ �������� �� �ڷ� ");
		System.out.println(" �⵵ : " + currentDate.getYear());
		System.out.println(" ��    : " + currentDate.getMonth() + 1);
		System.out.println(" ��¥ : " + currentDate.getDate());
		System.out.println(" ���� : " + currentDate.getDay());
		System.out.println(" ��¥ : " + currentDate.toLocaleString());

	}

}
