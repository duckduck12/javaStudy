package chapter12;

class OverD{
	void show(int k) {
		System.out.println("OverD : "+(k*10));
	}
	void prn(int i) {
		System.out.println("OverD : prn() : "+i);
	}
}

class SubOverD extends OverD{
	void show(int i) {
		System.out.println("SubOverD : "+(i*10000));
	}
	void prn(String s) {
		System.out.println("SubOverD : prn(String s) : " +s);
	}
	void scr() {
		System.out.println("scr() : ");
	}
}
public class OverrideExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverD od = new SubOverD();
		od.show(1);
		od.prn(1);
		
		SubOverD sod = (SubOverD)od;
		sod.show(1);
		sod.prn("AAA");
		sod.scr();

	}

}
