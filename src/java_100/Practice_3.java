package java_100;

public class Practice_3 {
	public static void main(String[] args) {
		// [1]변수 선언
		int a;
		int b=33;int c=90;
		double d;
		char e;
		// [2]선언된 변수에 값을 대입
		a = 10;
		d = 10;
		e = 'A'; // 쌍따옴표하면 에러
		// [3]출력
		System.out.println(a); // 10
		System.out.println(b); // Err b값이 초기화 되어있지 않다
		System.out.println(c); // 90
		System.out.println(d); // 10.0
		System.out.println(e); // A
		// [4]여러 개 변수 선언 및 초기화 --> 선언 후 값을 셋팅
		// [4-1]
//		int x,y,z=900; // z만 초기화되고 x,y는 초기화 안됨.
//		System.out.println("[4-3]"+"-"+z);
		
		// [4-2]
//		int x,y,z;
//		x=900;
//		y=900;
//		z=900;
//		System.out.println("[4-3]"+x+"-"+y+"-"+z);
		
		//[4-3]
//		int x=300,y=400,z=500;
//		System.out.println("[4-3]"+x+"-"+y+"-"+z);
		
		//[4-4]: 같은 값으로 초기화
//		String str1,str2,str3;
//		str1,str2,str3="korea"; // 에러
		
		String str1,str2,str3;
		str1=str2=str3="korea";
		System.out.println("[4-4] 여러 문자열 변수 한꺼번에 초기화:"+str1+"-"+str2+"-"+str3);
		
		int i,j,k;
		i=j=k=100;
		System.out.println("[4-4] 여러 정수형 변수 한꺼번에 초기화"+i+"-"+j+"-"+k);
	}
}
