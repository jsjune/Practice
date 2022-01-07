package java_100;

public class Practice_12 {
	public static void main(String[] args) {
		
		//&&(and) ||(or) !(not)
		//관계 연산자와 마찬가지로 결과로써 나오는 값은 참, 거짓으로 나오므로 결과를 받는 타입은 boolean.
		int a=10,b=20,c=30;
		
		boolean rst1=a<b && c>b; //true 둘다 참
		System.out.println(rst1);
		boolean rst2=a<b || c<b; //true 둘중 하나가 참이므로
		System.out.println(rst2);
		boolean rst3=a>c || b!=c; //true 둘중 하나가 참이므로
		System.out.println(rst3);
		boolean rst4= !rst3;
		System.out.println(rst4); // rst3이 true인데 부정이므로 false
		System.out.println(!rst4); // 다시 부정으로 true
	}
}
