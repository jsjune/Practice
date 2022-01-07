package test;

import java.io.*;

public class Test5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("a 혹은 b를 입력하십시오.");
		
//		String str = br.readLine();
//		char res = str.charAt(0);
		char res =br.readLine().charAt(0);
		// cahrAt() -> String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석
		// (0)의 의미는 문자열에서 문자의 순서를 나타내는 것 -> 몇 번째에 있는 문자를 가져올 것인지에 대한 index번호 -> str이 가리키고 있는 문자열에서 0번째에 있는 문자를 char타입으로 변환한다는 의미
		
		switch(res) {
		case 'a':
			System.out.println("a가 입력되었습니다.");
			break;
		case 'b':
			System.out.println("b가 입력되었습니다.");
			break;
		default:
			System.out.println("a혹은 b를 입력하십시오.");
			break;
			
		}
	}
}
