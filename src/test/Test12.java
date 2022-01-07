package test;

import java.io.*;

public class Test12 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int[] test = new int[5];
		System.out.printf("%d명의 점수를 입력하십시오.\n",test.length);
		
		for(int i=0; i<test.length;i++) {
			test[i] = Integer.valueOf(br.readLine());
		}
		
		for(int i=0; i<test.length-1; i++) {
			for(int j=i+1; j<test.length; j++) {
				if(test[j]>test[i]) {
					int score = test[j];
					test[j] = test[i];
					test[i] = score;
				}
			}
		}
		
		for(int i=0; i<test.length; i++) {
			System.out.printf("%d번째 사람의 점수는 %d입니다.\n",i+1,test[i]);
		
		}
		
		int max = 0;
		for(int i=0; i<test.length; i++) {
			if(max<test[i]) {
				max=test[i];
			}
		}
		
		System.out.printf("가장 높은 점수는 %d점입니다.",max);
	}
}
