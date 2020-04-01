package chapter23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	
	BufferedWriter writer = null;
	Socket socket = null;
	ServerSocket server = null;
	
	public void serverStart() {
		System.out.println("접속자를 기다리는 중입니다. ");
		
		try {
			server = new ServerSocket(2006);
			socket = server.accept();
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			System.out.println("클라이언트 IP : "+socket.getInetAddress().getHostAddress()
					+ "이름 : "+socket.getInetAddress().getHostName()+"연결되었습니다. ");
			
			ChatServerHandler handler = new ChatServerHandler(socket);
			handler.start();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			String s ="";
			
			while(true) {
				try {
					System.out.print("=>");
					s = in.readLine();
					if(s.contentEquals("999")) {
						break;
					}
					writer.write(s);
					writer.newLine();
					
					writer.write("--------------------------------------");
					writer.newLine();
					
					writer.flush();
					
					
				}
				catch(IOException e) {
					System.out.println("Err : "+e.toString());
				}
			}
		}
		catch(IOException ioe) {
			System.out.println("Exception generated...");
		}
		finally {
			try {
				server.close();
			}
			catch(IOException ignored) {
				
			}
		}
	}

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		ChatServer cs = new ChatServer();
		cs.serverStart();

	}

}

class ChatServerHandler extends Thread{
	protected Socket socket;
	String line;
	
	public ChatServerHandler(Socket socket) {
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