package test;

class Car{
	protected int num;
	protected double gas;
	
	public Car() {
		num = 0; gas = 0.0;
		System.out.println("자동차가 만들어졌습니다.");
	}
}

class RacingCar extends Car{
	private int course;
	
	public RacingCar() {
		course = 0;
		System.out.println("레이싱 카가 만들어졌습니다.");
	}
}

public class Test33 {
	public static void main(String[] args) {
		Car[] cars = new Car[2];
		
		cars[0] = new Car();
		cars[1] = new RacingCar();
		
		for(int i = 0; i < cars.length; i++) {
			Class c1 = cars[i].getClass();
			System.out.println((i + 1) + "번째 객체의 클래스는" + c1 + "입니다.");
		}
	}
}
