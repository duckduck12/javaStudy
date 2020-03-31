package chapter20;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String source = "너굴맨은 실패하지 않는다!";
		String fname = "";

		try {
			System.out.println("저장할 파일명을 입력하세요.");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
		} catch (Exception e) {
			System.out.println("Err : " + e.toString());
		}

		FileWriter fw = new FileWriter(fname);
		fw.write(source);
		System.out.println("파일을 저장했습니다. ");
		fw.close();

	}

}
