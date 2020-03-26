package chapter19;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String months[] = { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월" };
		Calendar calendar = Calendar.getInstance();

		System.out.print("날짜 : ");
		System.out.print(calendar.get(Calendar.YEAR) + "년");
		System.out.print(" " + months[calendar.get(Calendar.MONTH)]);
		System.out.println(" " + calendar.get(Calendar.DATE) + "일");

		System.out.print("시간 : ");
		System.out.print(calendar.get(Calendar.HOUR) + "시");
		System.out.print(" " + calendar.get(Calendar.MINUTE) + "분");
		System.out.println(" " + calendar.get(Calendar.SECOND) + "초");

		calendar.set(Calendar.HOUR, 22);
		calendar.set(Calendar.MONTH, 8);
		calendar.set(Calendar.SECOND, 2);

		System.out.print("수정된 시간 : ");
		System.out.print(" " + calendar.get(Calendar.HOUR) + "시");
		System.out.print(" " + calendar.get(Calendar.MINUTE) + "분");
		System.out.println(" " + calendar.get(Calendar.SECOND) + "초");

	}

}
