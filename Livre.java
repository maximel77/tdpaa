package td4PAAexo2;

public class Livre extends Produit {
	private String titre;
	private String auteur;
	private int ISBN;
	public Livre(double p,String t, String a, int i) {
		super(p,TauxTVA.reduit.getvalue());
		this.titre=t;
		this.auteur=a;
		this.ISBN=i;
	}

}
