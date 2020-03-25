package chapter18;

public class StringBufferExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1 = new StringBuffer("Hello JAVA");
		StringBuffer str2 = new StringBuffer("안녕하세요 자바");

		System.out.println("버퍼1 문자열 내용 ==>" + str1);
		System.out.println("버퍼1 문자열 길이 ==> " + str1.length());
		System.out.println("버퍼1 할당된 용량 ==> " + str1.capacity());

		System.out.println("버퍼2 문자열 내용 ==>" + str2);
		System.out.println("버퍼2 문자열 길이 ==> " + str2.length());
		System.out.println("버퍼2 할당된 용량 ==> " + str2.capacity());

	}

}
