package td4PAAexo2;

public abstract  class Produit {
	public  static double prix;
	public static   double  tva;
	public Produit(double p,double t) {
		this.prix=p;
		this.tva=t;
	}
	public double getprix() {
		return prix;
	}
	
	
	
	public  double ttcc() {
		double taux=(tva *prix)/100;
		return prix+taux;
		
	}

}
