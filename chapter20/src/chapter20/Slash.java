package chapter20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Slash {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("aaaa\naaaa");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		
		System.out.println(a.contains("\\n"));
		a = a.replace("\\n", "\n"); // \n 출력 안됨 을 해결
		System.out.println(a);

	}

}
