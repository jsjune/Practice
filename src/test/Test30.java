package test;

class Car{
	protected int num;
	protected double gas;
	
	public Car() {
		num = 0; gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
	public void setCar(int n, double g) {
		num = n; gas = g;
		System.out.println("차량 번호를" + num + "으로, 연료 양을" + gas + "로 바꾸었습니다.");
	}
	public void show() {
		System.out.println("차량 번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
}

class RacingCar extends Car{
	private int course;
	
	public RacingCar() {
		course = 0;
		System.out.println("레이싱 카가 만들어졌습니다.");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("코스 번호를" + course + "로 했습니다.");
	}
	public void show() {
		System.out.println("레이싱 카의 차량 번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다");
		System.out.println("코스 번호는" + course + "입니다");
	}
}

public class Test30 {
	public static void main(String[] args) {
		Car[] cars = new Car[2];
		
		cars[0] = new Car();
		cars[0].setCar(1234, 20.5);
		
		cars[1] = new RacingCar();
		cars[1].setCar(4567,30.5);
		
		for(int i=0; i<cars.length; i++) {
			cars[i].show();
		}
	}
}
