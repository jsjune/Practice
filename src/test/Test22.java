package test;

import java.io.*;

public class Test22 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열을 입력하십시오.");
		
		String str1 = br.readLine();
		
		System.out.println("안녕하십니까. 검색어를 입력하십시오.");
		
		String str2 = br.readLine();
		char ch = str2.charAt(0);
		
		int num = str1.indexOf(ch);
		
		if(num != -1)
			System.out.printf("%s의 %d번째에서 %s를 발견했습니다.",str1,num+1,ch);
		else
			System.out.printf("%s에서 %s를 찾을 수 없었습니다.");
	}
}
