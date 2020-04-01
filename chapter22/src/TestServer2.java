

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�մ��� ���� ���α׷� �۵���");

		ServerSocket server = null;

		try {
			server = new ServerSocket(2006);
			while (true) {
				System.out.println("Ŭ���̾�Ʈ ������ ������Դϴ�. ");
				Socket client = server.accept();

				InetAddress ia = client.getInetAddress();
				String name = ia.getHostName() + "\n";
				String ip = ia.getHostAddress() + "\n";

				System.out.println("Ŭ���̾�Ʈ ���ӵ�..." + "name : " + name + "ip : " + ip);

				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

				//writer.write("�������");
				writer.write("�մ��� ������ ���� �Ͻ� ���� ȯ���մϴ�. ");
				writer.newLine();
				writer.write("�ڼ�ȣ�ϴ� ���ġ�");
				writer.newLine();
				writer.write("1. ����, �췰 �� ���� Ȱ��ȸ");
				writer.newLine();
				writer.write("2. ������, �ſ���, ������, �߾��� �� ���� ����");
				writer.newLine();
				writer.write("3. �հ���, ����, ���, �Ұ�� �� ");
				writer.newLine();
				writer.write("4. ���뺺��, «�Ͷ��, ��ġ�, �������� ");
				writer.newLine();
				writer.write("����� ���ô� ����");
				writer.newLine();
				writer.write("1. ������, ����, ������");
				writer.newLine();
				
				
				writer.flush();

				try {
					client.close();
				} catch (IOException e) {
					System.out.println("Socket�� �ݴ� �� ������ �����ϴ�. " + e.toString());
				}

			}
		} catch (IOException e) {
			
			System.out.println("Exception generated...");

		} finally {

			try {
				server.close();
				System.out.println("���� �۵��� �����մϴ�. ");
			} catch (IOException e) {
				System.out.println("ServerSocket�� �ݴ� �� ������ �����ϴ�. " + e.toString());
			}
		}
		InputStream is = System.in;
		try {

			is.read();
		} catch (Exception e) {

		}
		System.out.println("���� ���α׷��� �����մϴ�. ");
	}

}
