package test;

import java.io.*;

public class Test6 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("몇 번째 코스를 선택 하시겠습니까?");
		System.out.println("정수를 입력하십시오.");
		
		int res = Integer.parseInt(br.readLine());
		
		char ans = (res == 1)? 'A': 'B';
		// 조건 연산자
		// 조건? 참(true)인 경우 식1 : 거짓(false)인 경우 식2
		
		System.out.println(ans + " 코스를 선택했습니다.");
		
	}

}
