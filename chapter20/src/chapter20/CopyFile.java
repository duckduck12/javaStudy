package chapter20;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("----------�����߻�------------");
			System.out.println("usage : java CopyFile <�������ϸ�> <������ϸ�>");
			
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
			
			System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�. ");
			
			in.close();
			out.close();

		}
		else {
			System.out.println("input���� ������ ����. ");
		}
		
		
		
	}

}
