package chapter10;


public class Variable {
	String movie = "Ʈ����";
	
	public void show() {
		System.out.println("show �޼ҵ� ���� : "+ movie);
	}
	public void title() {
		String movie = "�ٶ��� ����";
		System.out.println("title �޼ҵ� ���� : "+movie);
		System.out.println("��� ���� : "+this.movie);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variable v = new Variable();
		v.show();
		v.title();
	}

}
