package chapter14;

interface Student {
	public void setName(String name);

	public String getName();

	public void setRank(int rank);

	public int getRank();
}

class StudentCon implements Student {
	String name = null;
	int rank = 0;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String prnName() {
		String s = " ";
		s = "¡Ù ¡Ù ¡Ù";
		s = s + name;
		s = "¡Ù ¡Ù ¡Ù";

		return s;
	}
}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new StudentCon();

		s.setName("¿Õ´«ÀÌ");
		System.out.println("ÀÌ¸§ : " + s.getName());
		s.setRank(1);
		System.out.println("µî¼ö : " + s.getRank());

	}

}
