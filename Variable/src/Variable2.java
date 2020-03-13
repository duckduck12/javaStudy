
public class Variable2 {

	public static void main(String[] args) {

		/*
		 * <자료형 > 기본형 int, double, char, boolean, ... 메모리 공간 중 stack 영역에 실제 데이터 저장
		 * stack영역의 데이터들은 프로그램 종료 시 자동처리 됨
		 */
		int a;
		double b;
		/*
		 * 참조형 String 실제 값은 heap영역에, stack에는 값이 있는 heap영역의 번지 수가 저장 heap영역은 수동으로 정리해줘야 됨
		 * 자바는 자동정리 됨. garbage collection (GC)
		 */
		String c;

	}
}
