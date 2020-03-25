package chapter18;

public class StringbufferExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1 = new StringBuffer("☆☆자바");

		System.out.println("버퍼에 들어있는 내용 ==> " + str1);
		System.out.println("문자열 끼워넣기 ==> " + str1.insert(2, "GOOD"));
		System.out.println("버퍼의 5번째 문자 ==> " + str1.charAt(4));

		str1.setCharAt(0, '★');
		System.out.println("0번째 값을 '★'로 변경 ==> " + str1);

		str1.setLength(6);
		System.out.println("str1.setLength(6) 지정 후");

		System.out.println("버퍼의 새로운 값 ==> " + str1);
		System.out.println("문자열의 역순출력하기 ==> " + str1.reverse());
		System.out.println("내용의 길이 ==> " + str1.length());
		System.out.println("할당된 용량 ==> " + str1.capacity());

	}

}
