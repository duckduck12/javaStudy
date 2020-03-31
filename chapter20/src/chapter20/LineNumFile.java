package chapter20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LineNumFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String buf;
		BufferedReader fisOrg = null;
		PrintWriter fosDst = null;
		BufferedReader in = null;
		BufferedReader out = null;
		int nlines = 0;
		String fname = "";

		try {

			System.out.println("���ι�ȣ�� ���� ���ϸ��� �Է��ϼ��� : ");
			in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
			fisOrg = new BufferedReader(new FileReader(fname));

			System.out.println("������ ���ϸ��� �Է��ϼ��� : ");
			out = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
			fosDst = new PrintWriter(new FileWriter(fname));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Err : " + e.toString());
			e.printStackTrace();
			System.exit(1);
		}

		while (true) {
			try {
				buf = fisOrg.readLine();
				if (buf == null) {
					break;
				}
			} catch (IOException e) {
				System.out.println(e);
				break;
			}

			buf = nlines + ":" + buf;
			fosDst.println(buf);
			nlines++;
		}

		try {
			in.close();
			out.close();
			fisOrg.close();
			fosDst.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("������ �����߽��ϴ�. ");

	}

}
