package test;

class MyPoint{
	int x;
	int y;
	
	void setX(int px) {
		x = px;
	}
	void setY(int py) {
		y = py;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
}

public class Test18 {
	public static void main(String[] args) {
		MyPoint pl = new MyPoint();
		pl.setX(10);
		pl.setY(5);
		
		int px = pl.getX();
		int py = pl.getY();
		
		System.out.println("X 좌표는 " + px + " Y 좌표는 " + py + " 였습니다.");
	}
}


