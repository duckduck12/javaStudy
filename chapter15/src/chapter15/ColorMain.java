package chapter15;

interface Green {
	public String greenColor();
}

class GreenImpl implements Green {
	public String greenColor() {
		return "�ʷϻ��Դϴ�. ��";
	}
}

interface Red {
	public String redColor();
}

class RedImpl implements Red {
	public String redColor() {
		return "�������Դϴ�. ��";
	}
}

class Color implements Green, Red {
	public String greenColor() {
		return "�ʷϻ��Դϴ�. ";
	}

	public String redColor() {
		return "�������Դϴ�. ";
	}
}

public class ColorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Green g = new GreenImpl();
		System.out.println(g.greenColor());

		Red r = new RedImpl();
		System.out.println(r.redColor());

		Color c = new Color();
		System.out.println(c.greenColor());
		System.out.println(c.redColor());
	}

}
