package chapter21;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressTest {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("���� ��ǻ���� �̸� : " + address.getHostName());
		System.out.println("���� ��ǻ���� IP�ּ� : " + address.getHostAddress());

		address = InetAddress.getByName("java.sun.com");
		System.out.println("java.sun.com ������ �̸��� IP�ּ� : " + address);

		InetAddress SW[] = InetAddress.getAllByName("pottermore.com");
		for (int i = 0; i < SW.length; i++) {
			System.out.println(SW[i]);
		}

	}

}
