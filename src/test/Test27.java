package test;

import java.io.*;

public class Test27 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("정수를 2개 입력하십시오.");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		int ans = Math.min(num1, num2);
		System.out.printf("%d와 %d중 작은 쪽은 %d이다.",num1,num2,ans);
	}
}
