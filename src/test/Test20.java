package test;

class Car{
	public static int sum = 0; // 클래스 변수
	private int num;
	private double gas;
	
	public Car() {
	num = 0;
	gas = 0;
	sum++; // 생성자가 호출될 때 클래스 변수 sum의 값을 1 증가시킵니다.
	System.out.println("자동차가 만들어졌습니다.");
	}
	public void setCar(int n, double g)
	{
		num = n; gas = g;
		System.out.println("차량 번호를" + num + "으로, 연료량을" + gas + "로 바꾸었습니다.");
	}
	public static void showSum() { // 클래스 메소드 이다.
		System.out.println("자동차는 모두" + sum + "대 있습니다.");
	}
	public void show() {
		System.out.println("차량 번호는" + num + "입니다.");
		System.out.println("연료량은" + gas + "입니다.");
	}
}

public class Test20 {
	public static void main(String[] args) {
		Car.showSum();
		
		Car car1 = new Car(); // 객체를 생성
		car1.setCar(1234, 20.5);
		
		Car.showSum(); // 다시 한번 메소드를 호출
		
		Car car2 = new Car();
		car2.setCar(4567, 30.5);
		
		Car.showSum();
	}
}
