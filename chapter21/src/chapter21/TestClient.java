package chapter21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ŭ���̾�Ʈ ���α׷� �۵�...");
		
		Socket socket = null;
		
		try {
			socket = new Socket(args[0], 2006);
			System.out.println("������ ����Ǿ����ϴ�...");
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = reader.readLine();
			System.out.println(line);
		
		}
		catch(IOException e) {
			System.out.println("Exception generated...");
		}
		finally {
			try {
				socket.close();
				System.out.println("�������� ������ �����մϴ�.");
			}
			catch(Exception ignored) {
				
			}
		}
		
		InputStream is = System.in;
		try {
			is.read();
		}
		catch(Exception e) {
		
		}
		System.out.println("Client ���α׷� ������ �����մϴ�. ");

	}

}
