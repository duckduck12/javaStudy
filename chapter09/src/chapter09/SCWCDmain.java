package chapter09;
class SCWCD{
	int t1 =0;
	int t2 = 0;
	int t3 = 0;
	int t4 = 0;
	static int BONUS = 100;
	
	public SCWCD() {
		
	}
	public SCWCD(int t1, int t2, int t3, int t4) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
	}
	public String pass() {
		String msg = null;
		if(t1>=65&& t2>=65 && t3>=65 && t4>=65) {
			msg ="축하합니다. 합격입니다. ";
		}
		else {
			msg = "미안합니다. 불합격입니다. ";
		}
		return msg;
	}
	
	public static void prLine() {
		System.out.println("*****************");
		System.out.println("     STUDY             ");
		System.out.println("     JAVA             ");
		System.out.println("*****************");
	}
}

public class SCWCDmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SCWCD sc = new SCWCD(90, 90, 90, 90);
		sc.t1 = 100;
		SCWCD.prLine();
		System.out.println(sc.pass());

	}

}
