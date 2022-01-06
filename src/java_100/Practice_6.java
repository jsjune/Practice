package java_100;

public class Practice_6 {
	public static void main(String[] args) {
		byte b = 100;
		short s = 30000;
		int i = 2100000000;
		long l = 7000000000L; // 숫자뒤에 L
		float f = 9.8F; // 숫자뒤에 F
		double d = 3.14;
		char c = 'B';
		boolean bl = false;
		// printf() 출력 --> 지시자를 사용
		// %d(정수) %f(소숫점형식) %c(문자) %s(문자열) %b(부울) %n(줄바꿈) %e(지수) %o(8진수) %x(16진수)
		System.out.printf("%d,%d,%.1f,%.3f,%c,%n",i,l,f,d,c);
		System.out.printf("100은 8진수로 %o이고,16은 16진수로는 %x이다",100,16);
	}
}
