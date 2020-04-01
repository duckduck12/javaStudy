package chapter21;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressTest {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("로컬 컴퓨터의 이름 : " + address.getHostName());
		System.out.println("로컬 컴퓨터의 IP주소 : " + address.getHostAddress());

		address = InetAddress.getByName("java.sun.com");
		System.out.println("java.sun.com 도메인 이름과 IP주소 : " + address);

		InetAddress SW[] = InetAddress.getAllByName("pottermore.com");
		for (int i = 0; i < SW.length; i++) {
			System.out.println(SW[i]);
		}

	}

}
