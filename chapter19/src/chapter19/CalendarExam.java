package chapter19;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String months[] = { "1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��", "9��", "10��", "11��", "12��" };
		Calendar calendar = Calendar.getInstance();

		System.out.print("��¥ : ");
		System.out.print(calendar.get(Calendar.YEAR) + "��");
		System.out.print(" " + months[calendar.get(Calendar.MONTH)]);
		System.out.println(" " + calendar.get(Calendar.DATE) + "��");

		System.out.print("�ð� : ");
		System.out.print(calendar.get(Calendar.HOUR) + "��");
		System.out.print(" " + calendar.get(Calendar.MINUTE) + "��");
		System.out.println(" " + calendar.get(Calendar.SECOND) + "��");

		calendar.set(Calendar.HOUR, 22);
		calendar.set(Calendar.MONTH, 8);
		calendar.set(Calendar.SECOND, 2);

		System.out.print("������ �ð� : ");
		System.out.print(" " + calendar.get(Calendar.HOUR) + "��");
		System.out.print(" " + calendar.get(Calendar.MINUTE) + "��");
		System.out.println(" " + calendar.get(Calendar.SECOND) + "��");

	}

}
