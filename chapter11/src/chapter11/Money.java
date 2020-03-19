package chapter11;

class Chosun{
	String name = "Chosun";
}

class Korea extends Chosun{
	String k_name = "Korea";
}
public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korea k = new Korea();
		
		System.out.println(k.name);
		System.out.println(k.k_name);

	}

}
