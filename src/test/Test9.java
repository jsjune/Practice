package test;

// 소수인지 판별하는 코드

import java.io.*;

public class Test9 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("2 이상의 정수를 입력하십시오.");
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=2; i<=num; i++) {
			if(i==num) {
				System.out.printf("%d은 소수입니다.\n",num);
			}
			else if(num%i==0) {
				System.out.printf("%d은 소수가 아닙니다.\n",num);
				break;
			}
		}
	}
}
