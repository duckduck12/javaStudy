package chapter15;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ExceptionTest {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress address = InetAddress.getByName("vaver.com");

		try {
			Socket sk = new Socket(address, 8080);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
