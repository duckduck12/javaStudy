package chapter07;

public class Pay4 {

	String name;
	int bonbong;
	int tex;
	int silsu;

	public void setTex() {
		tex = (int) (bonbong * 0.045 + 0.5);
	}

	public void setSilsu() {
		float f;
		silsu = bonbong - tex;
		f = silsu / 100.0f;
		silsu = ((int) f) * 100;
	}

	public void prnPay() {
		System.out.println("성명 : " + name);
		System.out.println("본봉 : " + bonbong);
		System.out.println("세금 : " + tex);
		System.out.println("실수령액 : " + silsu);
	}
}
