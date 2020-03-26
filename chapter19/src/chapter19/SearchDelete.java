package chapter19;

import java.util.Vector;

public class SearchDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = {"왕눈이", "아로미", "투투" };

		Vector v = new Vector();
		String s = "왕눈이";

		for (int i = 0; i < name.length; i++) {
			v.addElement(name[i]);
		}

		if (v.contains(s)) {
			int i = v.indexOf(s);
			System.out.println("해당 객체가 인덱스 " + i + "번째에 있습니다. ");
		} else {
			System.out.println("해당 객체가 없습니다. ");
		}

		v.removeElementAt(0);

		System.out.println("===지우고 난 후에는===");

		for (int i = 0; i < v.size(); i++) {
			s = (String) v.elementAt(i);
			System.out.println("Vector " + i + "번째 요소는 " + s);
		}

	}

}
