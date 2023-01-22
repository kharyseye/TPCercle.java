package figures;

public class Point {
	protected int x;
	protected int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public double distance(Point p) {
		int a = p.x - this.x;
		int b = p.y - this.y;
		return(Math.sqrt(a*a+b*b));
	}

}
