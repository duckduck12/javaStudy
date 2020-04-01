package chapter21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("클라이언트 프로그램 작동...");
		
		Socket socket = null;
		
		try {
			socket = new Socket(args[0], 2006);
			System.out.println("서버에 연결되었습니다...");
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
				System.out.println("서버와의 접속을 종료합니다.");
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
		System.out.println("Client 프로그램 실행을 종료합니다. ");

	}

}
