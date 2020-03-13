
public class Variable {

	public static void main(String[] args) {

		// 변수 : 프로그램 진행 중 발생하는 데이터의 임시 저장
		// 데이터 담는 그릇
		// 데이터는 수정 가능

		// 변수 만들기
		// 자료형 (그릇 종류) 변수명 (그릇 이름);

		// 변수명 유의사항
		// 자유로우나 몇가지 제한
		/*
		 * 자바 문법은 X 숫자로 시작X 소문자 시작O 특수문자는 _만 띄어쓰기 시, '낙타체'(중간중간 대문자) 또는 _
		 */

		/*
		 * 자료형 int > 정수(소수점이 없는 숫자)
		 * 
		 */
		int myAge; // myAge 라는 이름의 그릇을 만듦.
		myAge = 20; // myAge 라는 그릇에 20을 담음.

		System.out.println("My age is : ");
		System.out.println(myAge);
		
		// 핸드폰 가격을 저장 (1000$)
		int phoneCost = 1000;	// 그릇을 만들고 1000담음
		// 변수만들고 초기화까지 한번에 ok	
				
		System.out.println("폰 가격 : " + phoneCost + "$");
		
		System.out.print("폰 가격 : ");
		System.out.print(phoneCost);
		System.out.println("$");
		
		// Self Test 신발사이즈 	( 260mm
		// 내 신발 사이즈는  ex이다. 
		
		int size = 240; 
		System.out.println("내 신발 사이즈는 "+ size + "mm 이다. ");
		// size(변수명)을  모두 입력하지 말고, s+ ctrl + space 를 사용할 것 
		
		size = 280; // int size = 280; ->  이것은 안된다. 
		System.out.println(size);
	}
}
