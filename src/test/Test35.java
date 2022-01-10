package test;
package test;

abstract class Vehicle{ // 추상 클래스
	protected int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("속도를" + speed + "으로 변경했습니다.");
	}
	abstract void show(); // 추상 메소드 show()
}

class Car extends Vehicle{ // 추상 클래스 확장
	private int num;
	private double gas;
	
	public Car(int n, double g) {
		num = n; gas = g;
		System.out.println("차량 번호" + num + ", 연료 양" + gas + "인 자동차가 만들어졌습니다.");
	}
	public void show() { // show() 메소드의 몸체
		System.out.println("차량 번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
		System.out.println("속도는" + speed + "입니다.");
	}
}

class Plane extends Vehicle{ // 추상 클래스 확장
	private int flight;
	
	public Plane(int f) {
		flight = f; 
		System.out.println("비행기 번호가" + flight + "인 비행기가 만들어졌습니다.");
	}
	
	public void show() { // show() 메소드의 몸체
		System.out.println("비행기 번호는" + flight + "입니다.");
		System.out.println("속도는" + speed + "입니다.");
	}
}

public class TEst35 {
	public static void main(String[] args)
	{
		Vehicle[] vc = new Vehicle[2]; // 추상 클래스 배열을 준비합니다.
		
		vc[0] = new Car(1234,20.5); 
		vc[0].setSpeed(60);
		vc[1] = new Plane(232);
		vc[1].setSpeed(500);
		
		for(int i = 0;i < vc.length; i++) {
			vc[i].show();
		}
		
	}
}
