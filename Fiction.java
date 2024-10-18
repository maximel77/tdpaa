package td4PAAexo3;

public class Fiction extends Programme {
	private String titre;
	private String realisateur;
	private boolean rediffusion;
	public Fiction(int d, int f,String p, String n,boolean b) {
		super(d,f);
		this.titre=p;
		this.realisateur=n;
		this.rediffusion=b;
	}

}
