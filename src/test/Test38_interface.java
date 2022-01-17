package test;
// 탈 것 인터페이스
interface iVehicle{
	void vshow(); // iVehicle의 추상 메소드
}
// 목재 인터페이스
interface iMaterial{
	void mshow(); // iMaterial의 추상 메소드
}
// 자동차 클래스
class Car implements iVehicle, iMaterial{
	private int num; private double gas;
	
	public Car(int n,double g) {
		num = n; gas = g;
		System.out.println("차량 번호가" + num + "이며, 연료 양이" + gas + "인 자동차가 만들어졌습니다.");
	}
	
	public void vshow() { // iVehicle의 메소드를 정의
		System.out.println("차량 번호는" + num + "입니다.");
		System.out.println("연료 양은" + gas + "입니다.");
	}
	
	public void mshow() { // iMaterial의 메소드를 정의
		System.out.println("자동차의 재질은 철입니다.");
	}
}
public class Test38_interface {
	public static void main(String[] args) {
		Car car1 = new Car(1234, 20.5); 
		car1.vshow();
		car1.mshow();
	}
}
