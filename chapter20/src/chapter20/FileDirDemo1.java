package chapter20;

import java.io.File;

public class FileDirDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directory = "C:\\java_project\\mywork_java\\chapter20";
		File f1 = new File(directory);

		if (f1.isDirectory()) {
			System.out.println("�˻� ���丮 " + directory);
			System.out.println("================================");
			String s[] = f1.list();

			for (int i = 0; i < s.length; i++) {
				File f = new File(directory + "/" + s[i]);

				if (f.isDirectory()) {
					System.out.println(s[i] + " : ���丮");

				} else {
					System.out.println(s[i] + " : ����");
				}

			}
		} else {
			System.out.println("������ " + directory + "�� ���丮�� �ƴ�");
		}

	}

}
