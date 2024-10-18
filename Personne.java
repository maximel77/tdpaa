package td4PAAexo4;

public class Personne implements Comparable<Personne> {
	private String prenom;

	/**
	 * Le nom de la personne.
	 */
	private String nom;

	/**
	 * Le numero de telephone de la personne.
	 */
	private String numero;

	/**
	 * Construit une personne a partir des informations requises.
	 * 
	 * @param prenom le prenom de la personne
	 * @param nom    le nom de la personne
	 * @param numero le numero de telephone de la personne
	 */
	public Personne(String prenom, String nom, String numero) {
		this.prenom = prenom;
		this.nom = nom;
		this.numero = numero;
	}

	/**
	 * Permet d'acceder au prenom de la personne
	 * 
	 * @return le prenom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Permet d'acceder au nom de la personne
	 * 
	 * @return le nom de la personne
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Permet d'acceder au numero de telephone de la personne
	 * 
	 * @return le numero de telephone de la personne
	 */
	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return prenom + " " + nom + " : " + numero;
	}

	@Override
	public int compareTo(Personne personne) {
		if (this.nom.equals(personne.nom)) {
			return this.prenom.compareTo(personne.prenom);
		}
		return this.nom.compareTo(personne.nom);
	}
}



