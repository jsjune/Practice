package java_100;

public class Practice_11 {
	public static void main(String[] args) {
		int kor=70,eng=50,math=80;
		boolean rst1,rst2,rst3,rst4,rst5,rst6;
		
		rst1 = kor == eng; //false
		rst2 = kor != eng; //true
		rst3 = kor > eng; //true
		rst4 = kor >= math; //false
		rst5 = kor < eng; //false
		rst6 = kor <= math; //true
		
		System.out.println(rst1);
		System.out.println(rst2);
		System.out.println(rst3);
		System.out.println(rst4);
		System.out.println(rst5);
		System.out.println(rst6);
	}
}
