

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DecimalFormat;

public class ThreadServer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread를 이용한 다중 접속 서버 작동됨...");
		
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(2006);
			
			while(true) {
				Socket client = server.accept();
				
				System.out.println("클라이언트 IP : "+client.getInetAddress().getHostAddress()
						+"이름 : "+client.getInetAddress().getHostName()+"연결되었습니다. ");
				
				StockHandler handler = new StockHandler(client);
				handler.start();
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
}

class StockHandler extends Thread{
	protected Socket socket;
	
	public StockHandler(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			double d;
			int min = 1000;
			int max = 1000000;
			int rnd = 0;
			int count = 0;
			DecimalFormat comma = new DecimalFormat("###,##0");
			writer.write("왕눈이 스레드 다중접속 서버에 접속하신 것을 환영합니다. ");
			writer.newLine();
			
			while(true) {
				count++;
				d = Math.random();
				rnd = ((int)(d*((max-min)+1))+min);
				String s = comma.format(rnd);
				writer.write("종목 : "+count+" "+"    주가 : "+s);
				writer.newLine();
				
				writer.flush();
				sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.toString());
		}
		catch(IOException e) {
			System.out.println(e.toString());
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
