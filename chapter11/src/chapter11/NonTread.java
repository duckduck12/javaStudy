package chapter11;

class GenClass {
	private String name;
	private int num;

	public GenClass(String a, int b) {
		name = a;
		num = b;
	}

	public void rename(String a) {
		String str = a;

		System.out.println("\nrename()--------------------------");
		System.out.println("rename() ; " + str);
		System.out.println("rename() str.hashcode : " + str.hashCode());

		str = "��" + str;
		System.out.println("\nrename()  ���ڿ� ���� ----------------------");
		System.out.println("rename() ; " + str);
		System.out.println("rename() str.hashcode : " + str.hashCode());

	}
}

public class NonTread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenClass t1 = new GenClass("first", 1);

		String sc = "��~��~�α�";
		System.out.println("\nmain()--------------------------");
		System.out.println("main() sc : " + sc);
		System.out.println("main() sc.hashcode : " + sc.hashCode());

		t1.rename(sc);
		System.out.println("\nmain() rename(sc) ��------------------------");
		System.out.println("main() sc : " + sc);
		System.out.println("main() sc.hashcode : " + sc.hashCode());

	}

}
