package chapter19;

import java.util.Hashtable;

public class NewHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht = new Hashtable();

		ht.put("one", "°³±¸¸®");
		ht.put("two", "¿Õ´«ÀÌ");
		ht.put("three", "¾Æ·Î¹Ì");

		String s = (String) ht.get("two");

		if (s == null) {
			System.out.println("two = " + s);
		} else {
			System.out.println(s);
		}

	}

}
