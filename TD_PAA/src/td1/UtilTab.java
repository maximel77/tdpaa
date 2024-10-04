package td1;
public class UtilTab {
	public static void affichageTableau(double[] tab, boolean enLigne) {
		for(int i = 0 ;i < tab.length ;i++) {
			System.out.print(tab[i]);
			if(enLigne) {
				System.out.print("␣");
			}
			else {
				System.out.println();
			}
		}
		System.out.println();
	}
	public static boolean appartient(double val, double[] tab) {
		for(int i = 0 ;i < tab.length ;i++) {
			if(tab[i] == val) {
				return true ;
			}	
		}
		return false ;
	}
	public static double min(double[] tab) {
		double tmpMin = tab[0] ;
		for(int i = 1 ;i < tab.length ;i++) {
			if(tab[i] < tmpMin) {
				tmpMin = tab[i];
			}
		}
		return tmpMin ;
		}
	public static double somme(double[] tab) {
		double tmpSomme = 0 ;
		for(int i = 0 ;i < tab.length ;i++) {
			tmpSomme += tab[i];
		}
		return tmpSomme;
	}
	public static void triParSelection(double[] tab) {
		for(int i = 0 ;i < tab.length - 1 ;i++) {
			int indiceMin = rechercheIndicePlusPetit(tab, i);
			if(indiceMin != i) {
				echanger(tab,i, indiceMin);
			}
		}
	}
	private static int rechercheIndicePlusPetit(double[] tab, int indiceMin) {
		for(int j = indiceMin + 1 ;j < tab.length ;j++) {
			if(tab[j] < tab[indiceMin]) {
				indiceMin = j ;
			}
		}
		return indiceMin ;
	}
	private static void echanger(double[] tab, int i, int j) {
		double tmpVal = tab[i];
		tab[i] = tab[j];
		tab[j] = tmpVal ;
	}
	public static double moyenne(double [] tabe) {
		double s= somme(tabe);
		return s/(tabe.length);
	}
	public static double mediane(double []tabe){
		double []tab=tabe.clone();
		triParSelection(tab);
		int taille=tabe.length;
		if(taille%2==0) {
			return (tab[taille/2]+tab[taille/2-1])/2;
		}
		else {
			return tab[taille/2];
		}
			
	}
	public static double moyenneponderer(double [] tab1, int []tab2) {
		int taille=tab1.length;
		double somme=0;
		int nbcoeff=0;
		for(int i=0;i<taille;i++) {
			somme+=tab1[i]*tab2[i];
			nbcoeff+=tab2[i];
		}
		return somme/nbcoeff;
	}




	
	public static void main(String args[]) {
		double []tabe= {1,2,3};
		int [] tab= {1,2,3};
		
		affichageTableau(tabe,true);
		System.out.println(appartient(4,tabe));
		System.out.println(min(tabe));
		System.out.println(somme(tabe));
	    
	    
	    System.out.println(moyenne(tabe));
	    System.out.println(mediane(tabe));
	    affichageTableau(tabe,true);
	    System.out.println(moyenneponderer(tabe,tab));
	    
	}
	

}
