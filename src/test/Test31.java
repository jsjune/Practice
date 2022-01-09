package test;

class Car{
	protected int num;
	protected double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	
	public void setCar(int n, double g) {
		num = n; gas =g;
		System.out.println("차량 번호를" + num + "으로, 연료 양을" + gas + "로 바꾸었습니다.");
	}
	
	public String toString() { // toSpring() 메소드를 정의
		String str = "차량 번호: " + num + "연료 양: " + gas; // 이 문자열을 반환한다.
		return str;
	}
}

public class Test31 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setCar(1234, 20.5);
		
		System.out.println(car1); // toSpring() 메소드의 반환 값이 사용된다.
	}
}		
