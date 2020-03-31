package chapter20;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �̸��� �������� : ");
		String name = "";

		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine();
		} catch (Exception e) {
			System.out.println("ERR : " + e.toString());
		}

		File file = new File(name);
		if (file.exists()) {
			System.out.println("���� �̸� : " + file.getName());
			System.out.println("��� �н� : " + file.getPath());
			System.out.println("���� �н� : " + file.getAbsolutePath());
			System.out.println("���� ���� : " + file.canWrite());
			System.out.println("�б� ���� : " + file.canRead());
			System.out.println("���� ���� : " + file.length() + "����Ʈ");
		}

	}

}
