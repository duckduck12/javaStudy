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
		System.out.println("성명 : " + name);
		System.out.println("본봉 : " + bonbong);
		System.out.println("세금 : " + tex);
		System.out.println("실수령액 : " + silsu);
	}
}
