package chapter13;

class Car {
	public int spd;

	public Car() {
		
	}
}

public class Truck extends Car {

	int spd;

	public Truck() {
		System.out.println("TruckŬ������  default(�⺻) �����ڰ� ȣ��Ǿ����ϴ�. ");
	}

	public void speedUp(int speed) {
		spd = speed;
	}

	public int getCarspd() {
		return super.spd;
	}

	public int getTruckspd() {
		return this.spd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck myTruck;
		myTruck = new Truck();
		myTruck.speedUp(300);

		System.out.println("Truck speed is " + myTruck.getTruckspd());
		System.out.println("Truck class�� spd ��������� �� : " + myTruck.spd);
		System.out.println("Car class�� spd ��������� �� : " + myTruck.getCarspd());

	}

}
