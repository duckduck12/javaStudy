package chapter11;

class Jumsu{
	public int kuk = 100;
	public int eng = 90;
	
	private int mat = 100;
	
	public Jumsu() {
		
	}
	
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
}

public class Mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jumsu sj = new Jumsu();
		sj.kuk = 100;
		sj.setMat(200);
		
		System.out.println(sj.kuk + " "+sj.getMat());

	}

}
