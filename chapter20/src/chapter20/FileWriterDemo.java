package chapter20;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String source = "�ʱ����� �������� �ʴ´�!";
		String fname = "";

		try {
			System.out.println("������ ���ϸ��� �Է��ϼ���.");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
		} catch (Exception e) {
			System.out.println("Err : " + e.toString());
		}

		FileWriter fw = new FileWriter(fname);
		fw.write(source);
		System.out.println("������ �����߽��ϴ�. ");
		fw.close();

	}

}
