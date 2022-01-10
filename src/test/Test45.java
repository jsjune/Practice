package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test45 {
	public static void main(String[] args) {
		try {
			// 파일 이름을 입력하여 표준 입력을 사용하기 위한 문자 스트림을 생성한다.
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
			// 버퍼를 경유하여 읽어들인다.
			
			// 1행을 읽어들인다.
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("파일에 기록된 2개의 문자열은");
			System.out.println(str1 + "입니다.");
			System.out.println(str2 + "입니다.");
			
			br.close();
		}
		catch(IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}
	}
}
