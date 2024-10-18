package td4PAAexo2;

public class Fruit extends Produit{
	private String nom;
	private String pays;
	
	public Fruit(double p,String t, String a) {
		super(p,TauxTVA.reduit.getvalue());
		this.nom=t;
		this.pays=a;
		
	}

}
