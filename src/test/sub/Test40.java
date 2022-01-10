package test.sub;

import test.Test40Car;

class Car {
	private int num; private double gas;
	
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
		System.out.println("연료 양은" + num + "입니다.");
	}
}

public class Test40 {
	public static void main(String[] args) {
		Test40Car car1 = new Test40Car();
		car1.show();
	}
}
