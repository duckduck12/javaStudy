package chapter20;

import java.io.File;

public class DirCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dname = new File("새폴더");
		boolean b = false;
		b = dname.mkdir();

		if (b) {
			System.out.println("폴더 생성 ");
		} else {
			System.out.println("폴더 생성 실패!");
		}

	}

}
