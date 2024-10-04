package td2;
import java.lang.Math;
public class Point {
	private double x;
	private double y;
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return this.x;
		
	}
	public double getY() {
		return this.y;
	}
	public double distance(Point p1) {
		return Math.pow(Math.pow(p1.x-this.x,2)+Math.pow(p1.y-this.y,2),0.5);
		
	}
	public static void main(String args []) {
		Point p1= new Point(2,3);
		Point p2= new Point(2,3);
		System.out.println(p2.distance(p1));
	}

}
