package test;

class MyPoint {
	private int x;
	private int y;

	public MyPoint() {
		x = 0;
		y = 0;
		System.out.println("초기 좌표를(" + x + "," + y + ")으로 한다.");
	}

	public MyPoint(int px, int py) {
		if(px >= 0 && px <= 100) x = px; else x=0;
		if(py >= 0 && py <= 100) y = py; else y=0;
		System.out.println("초기 좌표를 지정");
	}

	public void setX(int px) {
		if (px >= 0 && px <= 100) {
			x = px;
			System.out.println(x + "좌표를 저장");
		}
	}

	public void setY(int py) {
		if (py >= 0 && py <= 100) {
			y = py;
			System.out.println(y + "좌표를 저장");
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

public class Test21 {
	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint();
		p1.setX(2);
		p1.setY(5);

		int px1 = p1.getX();
		int py1 = p1.getY();
		
		System.out.printf("p1의 x 좌표는 %d y 좌표는 %d 이었습니다\n",px1,py1);
		
		MyPoint p2 = new MyPoint(20, 50);
		int px2 = p2.getX();
		int py2 = p2.getY();
		
		System.out.printf("p2의 x 좌표는 %d y 좌표는 %d 이었습니다",px2,py2);
		
	}
}
