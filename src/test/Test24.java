package test;

import java.io.*;

public class Test24 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("정수를 2개 입력하십시오.");
		
		int num1 = Integer.valueOf(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		int ans = Math.max(num1, num2);
		
		System.out.printf("%d와 %d중 큰 쪽은 %d입니다.",num1,num2,ans);
	}
}
