package td1;

public class exercice5 {
	public static double notefinale(double cc,double exam) {
		double moyenne=(cc+exam)/2;
		if(moyenne>exam) {
			return moyenne;		
		}
		else {
			return exam;
		}
	}
	public static double moyenneEtudiant(double[] tabe) {
		int taille=tabe.length;
		int compteur=0;
		double [] tab= new double[taille/2];
		for(int i=0;i<tabe.length-1;i+=2) {
			tab[compteur]=notefinale(tabe[i],tabe[i+1]);
		}
		UtilTab.affichageTableau(tab, false);
		return UtilTab.moyenne(tab);
			
		}
	
	public static void main(String args[]) {
		double [] tabe= {12,14,8,11,15,15};
		System.out.println(notefinale(16,15));
		System.out.println(moyenneEtudiant(tabe));
	}
}


