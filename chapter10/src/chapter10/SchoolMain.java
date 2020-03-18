package chapter10;

class School1{
	int kuk = 0;
	int eng = 0;
	int mat = 0;
	int tot = 0;
	
	public School1() {
		
	}
	public School1(int kuk) {
		this.kuk = kuk;
	}
	public School1(int kuk, int eng) {
		this.kuk = kuk;
		this.eng = eng;
	}
	public School1 (int kuk, int eng, int mat) {
		this.kuk = kuk;
		this.eng = eng;
		this.mat = mat;
	}
	public int hap() {
		tot = kuk+eng+mat;
		return tot;
	}
}

public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School1 sc1 = new School1(90);
		System.out.println("hap : "+sc1.hap());
		
		School1 sc2 = new School1(90, 80);
		System.out.println("hap : "+sc2.hap());
		
		School1 sc3 = new School1(90, 80, 100);
		System.out.println("hap : "+sc3.hap());

	}

}
