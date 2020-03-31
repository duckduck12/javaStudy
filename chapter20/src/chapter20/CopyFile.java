package chapter20;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("----------에러발생------------");
			System.out.println("usage : java CopyFile <원본파일명> <대상파일명>");
			
			System.exit(1);
		}
		
		File inputFile = new File(args[0]);
		File outputFile = new File(args[1]);
		
		if(inputFile.exists()) {
			FileReader in = new FileReader(inputFile);
			FileWriter out = new FileWriter(outputFile);
			
			int c; 
			
			while((c=in.read())!=-1) {
				out.write(c);
			}
			
			System.out.println("파일 복사가 완료되었습니다. ");
			
			in.close();
			out.close();

		}
		else {
			System.out.println("input받을 파일이 없다. ");
		}
		
		
		
	}

}
