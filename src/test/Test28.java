package test;

class Car{
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	public Car(int n, double g) {
		num = n; gas = g;
		System.out.println("차량 번호가" + num + "이며, 연료 양이" + gas + "인 자동차가 만들어졌습니다.");
	}
	public void setCar(int n, double g) {
		num = n; gas = g;
		System.out.println("차량 번호를 " + num + "으로, 연료 양을" + gas + "로 바꾸었습니다.");
	}
	public void show() {
		System.out.println("차량 번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
}

class RacingCar extends Car{ // 서브 클래스를 선언
	private int course; // 추가되는 필드
	
	public RacingCar() { // 서브 클래스의 생성자
		course = 0;
		System.out.println("레이싱 카가 만들어졌습니다.");
	}
	public RacingCar(int n, double g, int c) {
		super(n, g); // 슈퍼 클래스에 존재하는 두 개의 인수를 받는 생성자가 호출되도록 한다
		course = c;
		System.out.println("코스 번호가" + course + "인 레이싱 카가 만들어 졌습니다.");
	}
	public void setCourse(int c) { // 추가되는 메소드
		course = c;
		System.out.println("코스 번호가" + course + "로 했습니다.");
	}
}

public class Test28 {
	public static void main(String[] args) {
		RacingCar rccar1 = new RacingCar(1234, 20.5, 5); // 서브 클래스의 객체를 생성
		
//		rccar1.setCar(1234, 20.5); // 상속받은 메소드를 호출
//		rccar1.setCourse(5); // 추가된 메소드를 호출
		
	}
}
