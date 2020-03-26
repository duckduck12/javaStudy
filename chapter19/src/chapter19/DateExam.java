package chapter19;

import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentDate = new Date();
		System.out.println("현재 시스템 날짜는 " + currentDate + "입니다. ");

		Date mybirthday = new Date(81, 0, 20);
		System.out.println("나의 생일은 " + mybirthday + "입니다. ");

		System.out.println("오늘을 기준으로 한 자료 ");
		System.out.println(" 년도 : " + currentDate.getYear());
		System.out.println(" 월    : " + currentDate.getMonth() + 1);
		System.out.println(" 날짜 : " + currentDate.getDate());
		System.out.println(" 요일 : " + currentDate.getDay());
		System.out.println(" 날짜 : " + currentDate.toLocaleString());

	}

}
