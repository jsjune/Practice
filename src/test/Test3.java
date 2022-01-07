package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("문자열을 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		// System.in 표준입력(standard input)이라는 장치와 연결되어 있다. 
		//표준출력->컴퓨터화면, 표준입력->키보드
		
		String str = br.readLine(); // 키보드로 입력한 문자열을 str에 저장합니다
		
		System.out.println(str + "이(가) 입력되었습니다.");
		
	}
}
