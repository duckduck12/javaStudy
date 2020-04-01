

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread�� �̿��� ���� ���� ���� �۵���...");
		ServerSocket server = null;
		try {
			server = new ServerSocket(2006);

			while (true) {
				Socket client = server.accept();

				System.out.println("Ŭ���̾�Ʈ IP : " + client.getInetAddress().getHostAddress() + "�̸� : "
						+ client.getInetAddress().getHostName() + "����Ǿ����ϴ�. ");
				
				Handler handler = new Handler(client);
				handler.start();
			}
		} catch (IOException ioe) {

			System.err.println("Exception generated...");
		} finally {
			try {
				server.close();
			}
			catch(IOException ignored) {
				
			}

		}

	}

}

class Handler extends Thread {
	protected Socket socket;

	public Handler(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			writer.write("������ ���� ���� ������ ���� �Ͻ� ���� ȯ���մϴ�. ");
			writer.newLine();
			writer.write("1. JAVA");
			writer.newLine();
			writer.write("2. JSP");
			writer.newLine();
			writer.write("3. EJB");
			writer.newLine();
			writer.write("4. OJT");
			writer.newLine();

			writer.flush();

		} catch (IOException ignored) {

		} finally {
			try {
				socket.close();
			} catch (IOException ignored) {

			}
		}
	}
}