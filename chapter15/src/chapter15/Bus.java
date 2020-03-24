package chapter15;

public class Bus {
	int company;
	
	public static final int HYUNDAI = 1;
	public static final int DAEWOO = 2;
	public static final int KIA = 3;
	public static final int SSANGY = 4;
	public static final int SAMSUNG = 5;
	
	public Bus() {};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus myBus, yourBus;
		
		myBus = new Bus();
		myBus.company = Bus.HYUNDAI;
		System.out.println("Bus.HYUNDAI : "+Bus.HYUNDAI);
		
		yourBus = new Bus();
		yourBus.company = Bus.DAEWOO;
		
		if(myBus.company == Bus.HYUNDAI) {
			System.out.println("제 차는 현대에서 만들었습니다. ");
		}else if(myBus.company == Bus.DAEWOO) {
			System.out.println("제 차는 대우에서 만들었습니다. ");
		}else if(myBus.company == Bus.KIA) {
			System.out.println("제 차는 기아에서 만들었습니다. ");
		}
	}

}
