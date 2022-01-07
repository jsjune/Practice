package test;

import java.io.*;

public class Test11 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("시험 응시자 수를 입력하십시오.");
		
		int num = Integer.parseInt(br.readLine());
		// 배열의 선언
		int[] test;
		test = new int[num]; // int형의 값을 [?] ?개를 저장할 수 있는 배열을 생성
		
		System.out.println("시험 응시자 수만큼 점수를 입력하십시오.");
		for(int i=0; i<num; i++) {
			int score = Integer.parseInt(br.readLine());
			test[i] = score;
		}
		for(int i=0; i<num; i++) {
			System.out.printf("%d번째 사람의 점수는 %d입니다.\n",i+1,test[i]);
		}
		
	}
}

