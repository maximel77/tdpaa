package td4PAAexo2;

public class Medicament extends Produit {
	private String nom;
	private String laboratoire;
	private int comprime;
	
	public Medicament(double p,String t, String a,int n) {
		super(p,TauxTVA.particulier.getvalue());
		this.nom=t;
		this.laboratoire=a;
		this.comprime=n;
		
	}

}
