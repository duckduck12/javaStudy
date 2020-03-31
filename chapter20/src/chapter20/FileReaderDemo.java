package chapter20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String fname = "";
		try {
			System.out.println("읽어올 파일명을 입력하세요 : ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
		}
		catch(Exception e) {
			System.out.println("ERR : " + e.toString());
		}
		
		FileReader fr = new FileReader(fname);
		
		int i;
		
		while((i = fr.read())!=-1) {
			System.out.println((char)i);
		}
		
		fr.close();

	}

}
