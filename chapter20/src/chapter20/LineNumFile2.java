package chapter20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LineNumFile2 {

	public static void addLineNum(File f) {
		String buf;
		BufferedReader fisOrg = null;
		PrintWriter fosDst = null;
		BufferedReader in = null;
		int nlines = 0;
		String fname = f.toString();

		try {
			int i = fname.lastIndexOf("\\");

			System.out.println(fname);

			fisOrg = new BufferedReader(new FileReader(fname));

			fosDst = new PrintWriter(new FileWriter(fname + ".txt"));
		} catch (Exception e) {
			System.out.println("Err : " + e.toString());
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

			if (nlines < 10) {
				buf = "  " + nlines + " : " + buf;
			} else if (nlines >= 10 && nlines <= 99) {
				buf = " " + nlines + " : " + buf;
			} else if (nlines >= 100 && nlines <= 999) {
				buf = nlines + " : " + buf;
			}

			fosDst.println(buf);
			nlines++;
		}
		try {
			fisOrg.close();
			fosDst.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directory = "C:\\java_project\\mywork_java\\practiceExample\\src\\practiceExample";
		File dir = new File(directory);

		if (dir.isDirectory()) {

			String s[] = dir.list();

			for (int i = 0; i < s.length; i++) {

				File f = new File(directory + "/" + s[i]);
				System.out.println(f);

				if (f.isFile() && f.toString().endsWith(".java")) {

					LineNumFile2.addLineNum(f);

				}
			}

		} else {
			System.out.println("지정한 " + directory + "는 디렉토리가 아닙니다. ");
		}

	}

}
