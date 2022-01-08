package test;

class Car{
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	public Car(int n, double g) {
		this(); // 2개의 인수를 가지는 생성자의 시작 부분에서, 인수없는 생성자를 호출
		num = n; gas = g;
		System.out.println("차량 번호를" + num + "으로, 연료 양을" + gas + "로 바꾸었습니다.");
	}
	public void show() {
		System.out.println("차량 번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
}
public class Test29 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.show();
		
		Car car2 = new Car(1234, 20.5);
		car2.show();
	}
}
