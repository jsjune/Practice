package test;

class Car{
	int num;
	double gas;
	
	void setNum(int n) { // 값을 받는 가인수(Parameter)
		num = n;
		System.out.println("차량 번호를" + num + "으로 바꾸었습니다.");
	}
	
	void setGas(double g) {
		gas = g;
		System.out.println("연료 양을" + gas + "으로 바꾸었습니다.");
	}
	
	void show() {
		System.out.println("차량 번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
	
}

public class Test13 {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.setNum(1234); // 실인수(argument)
		car1.setGas(20.5);
		car1.show();
	}

}
