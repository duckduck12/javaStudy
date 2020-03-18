

public class School {

	int kuk;
	int mat;
	int eng;

	public School(int kuk) {
		this.kuk = kuk;
	}

	public School(int kuk, int mat) {
		//this.kuk = kuk;
		this(kuk);
		this.mat = mat;
	}

	public School(int kuk, int mat, int eng) {
		//this.kuk = kuk;
		//this.mat = mat;
		this(kuk, mat);
		this.eng = eng;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
