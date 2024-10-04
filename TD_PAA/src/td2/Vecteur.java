package td2;

public class Vecteur {
	private Point p1;
	private Point p2;
	public Vecteur(Point p1,Point p2) {
		this.p1=p1;
		this.p2=p2;
	}
	public boolean equals(Vecteur v2) {
		boolean b =false;
				if((p2.getX()-p1.getX())==v2.p2.getX()-v2.p1.getX()) {
					if((p2.getY()-p1.getY())==v2.p2.getY()-v2.p1.getY()){
						b=true;
					}
				}
				return b;
	}
	public static void main(String args []) {
		Point p1= new Point(3,3);
		Point p2= new Point(1,1);
		Point p3= new Point(4,5);
		Point p4= new Point(2,2);
		Vecteur v1= new Vecteur(p1,p2);
		Vecteur v2= new Vecteur(p3,p4);
		System.out.println(v1.equals(v2));
	}

}
