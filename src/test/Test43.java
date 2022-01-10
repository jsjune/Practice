package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test43 {
	public static void main(String[] args) {
		System.out.println("문자열을 입력하십시오.");
		
		try {
			// 버퍼를 경유하여 읽어 들인다. || 표준 입력을 사용하여 문자 스트림을 작성한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			System.out.println(str + "(이)가 입력되었습니다.");
		}
		catch(IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}
	}
}
