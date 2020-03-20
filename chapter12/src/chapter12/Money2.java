package chapter12;

class Chosun2{
	String name = "Chosun";
	
	public String attack() {
		return "»∞";
	}
}

class Korea2 extends Chosun2{
	String k_name = "Korea";
	
	public String k_attack() {
		return "k2 º“√—";
	}
}
public class Money2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korea2 k = new Korea2();
		System.out.println(k.attack());
		System.out.println(k.k_attack());
		
		Chosun2 c = new Chosun2();
		System.out.println(c.attack());

	}

}
