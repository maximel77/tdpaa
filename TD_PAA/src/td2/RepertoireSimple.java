package td2;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
public class RepertoireSimple {
	private Dictionnary<(String,String),String> repertoire;
	public RepertoireSimple() {
		this.repertoire= new has<Personne>();
	
	}
	public void addPersonne(String prenom,String nom,String numero) {
		Personne p= new Personne(prenom,nom);
		p.addNumero(numero);
		repertoire.add(p);
	}
	public String chercheNumero(String prenom,String nom) {
		for(Personne p:repertoire) {
			if ((p.getPrenom().equals(prenom)) & (p.getNom().equals(nom))) {
				
			}
		}
	}
	

}
