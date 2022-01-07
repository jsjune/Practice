package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException{
		System.out.println("정수를 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String str = br.readLine();
		int num = Integer.valueOf(str);
		//== int num = Integer.parseInt(br.readLine());
		
		System.out.println(num + "이(가) 입력되었습니다.");	
	}
}
