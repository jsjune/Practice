package test;

class Car{
	public static int sum = 0; // 클래스 변수
	private int num;
	private double gas;
	
	public Car() {
	num = 0;
	gas = 0;
	sum++; // 생성자가 호출될 때 클래스 변수 sum의 값을 1 증가시킵니다.
	System.out.println("자동차가 만들어졌습니다.");
	}
	public void setCar(int n, double g)
	{
		num = n;
	}
}

public class Test20 {

}
