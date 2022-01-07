package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test4 {
	public static void main(String[] args) throws IOException{
		System.out.println("정수를 2개 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.valueOf(br.readLine());
		int b = Integer.valueOf(br.readLine());
		
		System.out.printf("%d+%d=%d",a,b,a+b);
		
	}
}
