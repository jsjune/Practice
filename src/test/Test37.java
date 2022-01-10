package test;

interface iVehicle{ // 인터페이스를 선언
	void show(); // 추상 메소드
}

class Car implements iVehicle{ // 인터페이스 구현
	private int num; private double gas;
	
	public Car(int n, double g) {
		num = n; gas = g;
		System.out.println("차량 번호가" + num + "이며, 연료 양이" + gas + "인 자동차가 만들어졌습니다.");
	}
	
	public void show() { // 추상 메소드의 몸체를 만듦
		System.out.println("차량 번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
}

class Plane implements iVehicle{
	private int flight;
	
	public Plane(int f) {
		flight = f;
		System.out.println("비행기 번호가" + flight + "인 비행기가 만들어졌습니다.");
	}
	
	public void show() { // 추상 메소드의 몸체를 만듦
		System.out.println("비행기 번호는" + flight + "입니다.");
	}
}

public class Test37 {
	public static void main(String[] args) {
		iVehicle[] ivc = new iVehicle[2]; // 인터페이스 배열 준비
		
		ivc[0] = new Car(1234, 20.5); 
		ivc[1] = new Plane(232);
		
		for(int i = 0; i < ivc.length; i++) {
			ivc[i].show();
		}
	}
}
