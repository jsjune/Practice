package test;

import java.io.*;

public class Test23 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열을 입력하십시오.");
		
		String str1 = br.readLine();
		
		System.out.println("추가할 문자열을 입력하십시오.");
		
		String str2 = br.readLine();
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
		
		System.out.printf("%s에 %s를 추가하면 %s 입니다.",str1,str2,sb);
	}
}
