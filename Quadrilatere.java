package td4PAA;

public abstract  class Quadrilatere extends Figure {
	Point p1;
	Point p2;
	Point p3;
	Point p4;
	public Quadrilatere(Point p1,Point p2,Point p3, Point p4){
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		this.p4=p4;
		
		
	}
	public double perimetre() {
		return p1.distance(p2)+p2.distance(p3)+p3.distance(p4)+p4.distance(p1);
	}
	
}
