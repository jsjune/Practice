package test;

class MyPoint{
	private int x;
	private int y;
	
	public void setX(int px) {
		x=px;
		System.out.println(x + " 좌표를 저장");
	}
	public void setY(int py) {
		y=py;
		System.out.println(y + " 좌표를 저장");
	}
}

public class Test17 {
	public static void main(String[] args) {
		
		MyPoint getX = new MyPoint();
		MyPoint getY = new MyPoint();
		
		getX.setX(2);
		System.out.println("X 좌표를 취득");
		getY.setY(5);
		System.out.println("Y 좌표를 취득");
	}
}
