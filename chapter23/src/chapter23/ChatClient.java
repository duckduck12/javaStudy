package chapter23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ChatClient {

	BufferedWriter writer = null;
	
	Socket socket = null;
	
	String line;
	int cnt = 0;

	public void clientStart(String ip) {
		System.out.println("클라이언트 프로그램 작동 ... ");

		try {
			socket = new Socket(ip, 2006);
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			ChatClientHandler handler = new ChatClientHandler(socket);
			handler.start();

			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			String s = "";

			while (true) {
				try {
					System.out.print("=>");
					s = in.readLine();
					if (s.contentEquals("999")) {
						break;
					}
					writer.write(s);
					writer.newLine();

					writer.write("--------------------------------------");
					writer.newLine();

					writer.flush();

				} catch (IOException e) {
					System.out.println("Err : " + e.toString());
				}
			}
		} catch (IOException ioe) {
			System.out.println("Exception generated...");
		} finally {
			try {
				socket.close();
			} catch (IOException ignored) {

			}
		}
	}
	

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		ChatClient cc = new ChatClient();
		cc.clientStart(args[0]);
		
		
	}
}


class ChatClientHandler extends Thread{
	protected Socket socket;
	String line;
	
	public ChatClientHandler(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				line = reader.readLine();
				System.out.println("받은글 : "+line);
				System.out.print("=>");
			}
		}
		catch(IOException ignored) {
			
		}
		finally {
			try {
				socket.close();
			}
			catch(IOException ignored) {
				
			}
		}
	}
}
