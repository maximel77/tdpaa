package td4PAAexo2;

public class DVD extends Produit {
	private String titre;
	private String realisateur;
	public DVD(double p,String titre,String real) {
		super(p,TauxTVA.normal.getvalue());
		
		this.titre=titre;
		this.realisateur=real;
	}
	

}
