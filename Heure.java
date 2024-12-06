package tp8;

import java.lang.Math.*;
/**
 * Une classe qui represente un moment de la journee determine par son heure et
 * ses minutes (format 24h).
 */
public class Heure implements Comparable<Heure> {
	private final int h;
	private final int m;

	/***
	 * Constructeur de la classe Heure permettant d'instancier une Heure à partir d'un nombre d'heures et de minutes.
	 * @param h nombre d'heures
	 * @param m nombre de minutes
	 */
	public Heure(int h, int m) {
		this.h = h;
		this.m = m;
	}
	
	/***
	 * Methode permettant d'instancier une heure à partir des informations (si correctes) d'une chaine de caractères
	 * @param chaineHeureComplete
	 * @return l'heure associée à chaineHeureComplete (si correct)
	 */
	public static Heure nouvelleHeure(String chaineHeureComplete){
		// TODO Auto-generated method stub
		String h1;
		String m1;
		int h3;
		int m3;
		if(chaineHeureComplete.length()==5) {
			h1+=chaineHeureComplete.charAt(0)+chaineHeureComplete.charAt(1);
			m1+=chaineHeureComplete.charAt(3)+chaineHeureComplete.charAt(4);
			int h2= Integer.parseInt(h1);
			int m2= Integer.parseInt(m1);
			return new Heure(h2,m2);
			}
		return null;
	}
		
	
	
	/***
	 * Methode qui retourne le nombre de minutes entre deux heures 
	 * @param heure2
	 * @return
	 */
	public int duree(Heure heure2) {
		// TODO Auto-generated method stub
		int m2= heure2.getMinute();
		int h2= heure2.getHeure();
		int compteur1= 60*h+m;
		int compteur2=60*h2+m2;
		return Math.max(compteur1, compteur2)-Math.min(compteur1, compteur2);
	
		
	}
	
	public int getHeure() {
		return this.h;
	}
	
	public int getMinute() {
		return this.m;
	}

	@Override
	public String toString() {
		return h + "h" + m;
	}

	@Override
	public int hashCode() {
		return h + m;
	}

	@Override
	public boolean equals(Object obj) {
		Heure heure= (Heure) obj;
		return this.h==heure.getHeure()&& this.m==heure.getMinute();
	}

    public static int compare(Heure h1, Heure h2) {
    	return(h1.getHeure()<h2.getHeure()) ? -1 :
    }
	@Override
	public int compareTo(Heure o) {
		// TODO Auto-generated method stub
		
		return 0;
	}

}
