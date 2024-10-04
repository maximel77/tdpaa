package td2;

import up.mi.jgm.maths.Rationnel;
import up.mi.jgm.maths.Complexe;

public class Utilitaire {
	public static Rationnel puissance(Rationnel r,int n) {
		Rationnel re= new Rationnel(1);
		for(int i =0;i<n;i++) {
			re=re.multiplication(r);
		}
		return re;
		
	}
	public static Complexe somme(Complexe c1,Complexe c2) {
		double re=c1.getPartieReelle()+c2.getPartieReelle();
		double im= c1.getPartieImaginaire()+c2.getPartieImaginaire();
		Complexe c3= new Complexe(re,im);
		return c3;
		
		
	}
	public static Complexe multiplication(Complexe c1,Complexe c2) {
		double re= c1.getPartieReelle()*c2.getPartieReelle();
		double im=c1.getPartieImaginaire()*c2.getPartieImaginaire();
		Complexe c3= new Complexe(re,im);
		return c3;
	}
	public static void main(String args []) {
		Rationnel re= new Rationnel(3,5);
		Complexe c1= new Complexe(2,3);
		Complexe c2= new Complexe(4,5);
		System.out.println(re);
		System.out.println(puissance(re,3));
		System.out.println(somme(c1,c2));
		System.out.println(multiplication(c1,c2));
	}

}
