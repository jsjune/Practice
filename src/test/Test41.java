package test;

public class Test41 {
	public static void main(String[] args) {
		try { // 여기에서부터 예외 발생을 조사
			int[] test = new int[5];
			
			System.out.println("test[10]에 값을 대입합니다.");
			
			test[10] = 80; // 예외 발생
			System.out.println("test[10]에 80을 대입했습니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) { // 예외 발생하여 이 블록 안의 코드가 실행
			System.out.println("배열 길이를 넘어섰습니다."); 
		}
		System.out.println("무사히 종료했습니다.");
	}
}
