package test;

class Car {
	// 필드 2개
	private int num; // private 멤버
	private double gas;

	public void setNumGas(int n, double g) {
		if (g > 0 && g < 1000) {
			num = n;
			gas = g;
			System.out.println("차량 번호를" + num + "으로, 연료 양을" + gas + "로 바꾸었습니다.");
		}
		else {
			System.out.println(g + "는 올바른 연료 양이 아닙니다.");
			System.out.println("연료 양을 바꿀 수 없습니다.");
		}
	}

	public void show() {
		System.out.println("차량 번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
}

public class Test15 {
	public static void main(String[] args) {

		Car car1 = new Car();
		// 이러한 접근 불가능하다.  --> private 멤버에는 접근할 수 없습니다.
		// car1.num = 1234;
		// car1.gas = -10.0;
		
		car1.setNumGas(1234, 20.5);
		car1.show();
		
		System.out.println("잘못된 연료 양(-10.0)을 저장하겠습니다...");

		car1.setNumGas(1234, -10.0);
		car1.show();
	}

}