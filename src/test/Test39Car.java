package test;

public class Test39Car {
	private int num; private double gas;
	
	public Test39Car() {
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
