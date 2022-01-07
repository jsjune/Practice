package java_100;

public class Practice_7 {
	public static void main(String[] args) {
		
		//[1]정수선언
		int a = 12345;
		String str = "123";
//		System.out.println(a.length()); // 문자열이 아니여서 에러
		System.out.println(str.length());  // 3
		
		//[2]정수 --> 문장열로 변환 --> 자릿수 구하기
		String stra = String.valueOf(a);
		System.out.println(stra.length()); // 5
		
		//[3]문자열+정수형
		System.out.println(str+1); // 1231
		
		//[4]문자열-->정수로 변환
		int b = Integer.valueOf(str);
		System.out.println(b+1); //124
		
	}
}
