package chapter07;

public class Pay3 {

	String name;
	int bonbong;
	int tex;
	int silsu;

	public void setTex() {
		tex = (int) (bonbong * 0.05 + 0.5);
	}

	public void setSilsu() {
		silsu = bonbong - tex;
	}

	public void prnPay() {
		System.out.println("���� : " + name);
		System.out.println("���� : " + bonbong);
		System.out.println("���� : " + tex);
		System.out.println("�Ǽ��ɾ� : " + silsu);
	}
}
