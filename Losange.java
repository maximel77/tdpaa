package td4PAA;

public class Losange extends Quadrilatere {
	
	public Losange(Point p1,Point p2,Point p3, Point p4) {
		super(p1,p2,p3,p4);
		
		
	}
	public double surface() {
		double d1= p1.distance(p3);
		double d2= p2.distance(p4);
		return d1*d2/2;
		
	}

	public Figure translation(Vecteur vec) {
		return new Losange(p1.translation(vec),p2.translation(vec),p3.translation(vec),p4.translation(vec));
		
	}

}
