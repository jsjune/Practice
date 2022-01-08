package test;

import java.io.*;

public class Test26 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열을 입력하십시오.");
		String str = br.readLine();
		
		System.out.println("a가 들어갈 위치를 정수로 입력하십시오.");
		int num = Integer.valueOf(br.readLine());
		
		StringBuffer sb = new StringBuffer(str);
		sb.insert(num,'a');
		
		System.out.printf("%s가 되었습니다.",sb);
	}
}
