package chapter19;

import java.util.Hashtable;

public class NewHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht = new Hashtable();

		ht.put("one", "������");
		ht.put("two", "�մ���");
		ht.put("three", "�Ʒι�");

		String s = (String) ht.get("two");

		if (s == null) {
			System.out.println("two = " + s);
		} else {
			System.out.println(s);
		}

	}

}
