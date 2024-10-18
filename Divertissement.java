package td4PAAexo3;

public class Divertissement extends Programme {
	private String presentateur;
	private String nom;
	private int duree;
	public Divertissement(int d, int f,String p, String n) {
		super(d,f);
		this.presentateur=p;
		this.nom=n;
		this.duree=2;
	}
}
