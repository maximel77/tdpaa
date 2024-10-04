package td2;

public class Disque {
	private Point centre;
	private double rayon;
	public Disque(Point p,double r) {
		this.centre=p;
		this.rayon=r;
	}
	public boolean appartientDisque(Point p) {
		if(p.distance(centre)<= rayon) {
			return true;
			
		}
		return false;
	}
	public boolean intersection(Disque d2){
		double dist =this.centre.distance(d2.centre);
		if(dist <=this.rayon+d2.rayon) {
			return true;
			
		}
		return false;
		
	}
	
}
