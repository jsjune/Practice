package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test44 {
	public static void main(String[] args) {
		try {// 한 줄씩 기록하기 위해 준비
			// 버퍼를 경유하여 읽어들입니다.
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
			// 파일 이름을 입력하여 표준 입력을 사용하기 위한 문자 스트림을 생성한다.
			
			// 한 줄씩 기록 
			pw.println("Hello");
			pw.println("GoodBye");
			System.out.println("파일에 기록되었습니다.");
			
			pw.close(); // 파일을 닫는다.
		}
		catch(IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		}
	}
}
