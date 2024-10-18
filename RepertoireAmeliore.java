package td4PAAexo4;

import java.util.ArrayList;
import java.util.List;

public class RepertoireAmeliore extends RepertoireSimple {
	private Personne proprietaire;
	
	
	public RepertoireAmeliore(Personne p) {
		super();
		
		this.proprietaire=p;
	}
	public Personne cherchePersonne(String numero) {
		for(Personne p:super.getRepertoire()) {
			if (p.getNumero().equals(numero)){
				return p;
			}
		}
			
		System.out.println("personne non presente dans le repertoire");
		return null;
			
	}
		
	

}
