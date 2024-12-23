package td2;

import java.util.List ;
import java.util.ArrayList ;
import java.lang.StringBuilder;
public class Personne {
	private String nom ;
	private String prenom ;
	private List<String> numerosTelephone ;
	public Personne(String prenom, String nom){

		this.prenom = prenom ;
		this.nom = nom ;
		numerosTelephone = new ArrayList<String>() ;
	}
	public void addNumero(String numero){
		numerosTelephone.add(numero) ;
	}
	public String toString(){
		StringBuilder resultat= new StringBuilder();
		resultat.append(prenom+nom);
		resultat.append("\t");
		resultat.append(nom);
		resultat.append("\n");
		for(int i=0;i<numerosTelephone.size();i++) {
			resultat.append("numero");
			resultat.append(i+1);
			resultat.append(":");
			resultat.append(numerosTelephone.get(i));
			resultat.append("\n");
		}
		return resultat.toString();
		
		
	
	}
	public static void main(String[] args){
		Personne p = new Personne("John","Lennon");
		p.addNumero("0123456789");
		p.addNumero("0132456789");
		p.addNumero("0123996789");
		p.addNumero("0123459876");
		System.out.println(p.toString());
	}
}

