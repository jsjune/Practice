package java_100;

public class Practice_10 {
	public static void main(String[] args) {
		//[1] 정수끼리라도 나누기의 경우 소숫점 형태가 나올 수 있음.
		int a=60,b=8;
		int rst1; double rst2,rst3;
		
		rst1 = a/b;
		System.out.println(rst1); //7 
		System.out.println((double)rst1); //7.0
		
		rst2=a/(double)b; // 어느 한쪽의 값을 double타입으로 변환(둘다도 가능)
		System.out.println(rst2); //7.5 
		
		rst3=100/3;
		System.out.println(rst3); //33.0
		
		rst3=(double)100/3;
		System.out.println(rst3); //33.333..
		
		rst3=250/3.0;
		System.out.println(rst3); //83.333..
		System.out.printf("세 과목의 평균은 %.1f입니다.%n",rst3); //83.333..
		
		
	}
}
