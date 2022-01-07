package test;

public class Test10 {
	public static void main(String[] args) {
		// 배열의 선언
		int[] test;
		test = new int[5]; // int형의 값을 5개 저장할 수 있는 배열을 생성
	
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + "번째 사람의 점수는" + test[i] + "입니다.");
		}
	}

}
