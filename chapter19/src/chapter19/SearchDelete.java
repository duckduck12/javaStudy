package chapter19;

import java.util.Vector;

public class SearchDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = {"�մ���", "�Ʒι�", "����" };

		Vector v = new Vector();
		String s = "�մ���";

		for (int i = 0; i < name.length; i++) {
			v.addElement(name[i]);
		}

		if (v.contains(s)) {
			int i = v.indexOf(s);
			System.out.println("�ش� ��ü�� �ε��� " + i + "��°�� �ֽ��ϴ�. ");
		} else {
			System.out.println("�ش� ��ü�� �����ϴ�. ");
		}

		v.removeElementAt(0);

		System.out.println("===����� �� �Ŀ���===");

		for (int i = 0; i < v.size(); i++) {
			s = (String) v.elementAt(i);
			System.out.println("Vector " + i + "��° ��Ҵ� " + s);
		}

	}

}
