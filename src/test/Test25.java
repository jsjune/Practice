package test;

import java.io.*;

public class Test25 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열을 입력하십시오.");
		String str = br.readLine();
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		sb.length();
		
		System.out.printf("%s를 거꾸로 읽으면 %s입니다.",str,sb);
		
		
	}
}
