

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
		System.out.println("Thread�� �̿��� ���� ���� ���� �۵���...");
		
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(2006);
			
			while(true) {
				Socket client = server.accept();
				
				System.out.println("Ŭ���̾�Ʈ IP : "+client.getInetAddress().getHostAddress()
						+"�̸� : "+client.getInetAddress().getHostName()+"����Ǿ����ϴ�. ");
				
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
			writer.write("�մ��� ������ �������� ������ �����Ͻ� ���� ȯ���մϴ�. ");
			writer.newLine();
			
			while(true) {
				count++;
				d = Math.random();
				rnd = ((int)(d*((max-min)+1))+min);
				String s = comma.format(rnd);
				writer.write("���� : "+count+" "+"    �ְ� : "+s);
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
