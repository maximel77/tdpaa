package td1;
import java.util.Scanner;
public class Utilclass {
	public static int somme3(int entier1,int entier2, int entier3) {
		return entier1 + entier2 + entier3;
		
	}
	public static long factIt(int n) {
		int fact=n;
		int somme=1;
		while(fact>1) {
			somme=somme*fact;
			fact=fact-1;
			
		}
		;
		return somme;
			
		}
	public static long factRe(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*factRe(n-1);
			
		}
	}
	public static long Comb(int n,int p) {
		return (factRe(n))/(factRe(p)*factRe(n-p));
	}
	
	public static long puissance(int n,int m) {
		long puiss=1;
		for(int i=0;i<m;i++) {
			puiss=puiss*n;
		}
		return puiss;
		
	}
	public static int max2(int a, int b) {
		if(a>b) {
			return a;
		}
		else
			return b;
		
	}
	public static int max3v1(int a,int b,int c) {
		if(a>=b & a>=c) {
			return a;
		}
		else if(b>=a & b>=c) {
			return b;
		}
		else
			return c;
	}
	public static int max3v2(int a, int b,int c) {
		int n1=max2(a,b);
		int n2=max2(a,c);
		int n3=max2(b,c);
		if(a==n1&a==n2)
			return a;
		else if(b==n1 & b==n3)
			return b;
		else
			return c;
			
	}
	



	public  static void  main(String args[])throws Exception {
		Scanner sc = new Scanner(System.in);
		int rep;
		do {
			System.out.println("vous voulez alculer : une somme(1),une puissance(2),une combinaison(3),factorielle(4)");
			 rep= sc.nextInt();	
			switch(rep) {
				case 1:
					System.out.println("1ENTIER");
					int s1=sc.nextInt();
					System.out.println("2ENTIER");
					int s2=sc.nextInt();
					System.out.println("3ENTIER");
					int s3=sc.nextInt();
					System.out.println(somme3(s1,s2,s3));
					break;
				case 2:
					System.out.println("nombre");
					int n1=sc.nextInt();
					System.out.println("entrer la puissancet");
					int n2=sc.nextInt();
					System.out.println(puissance(n1,n2));
					break;
				case 3:
					System.out.println("entrer n");
					int l1=sc.nextInt();
					System.out.println("entrer p");
					int l2=sc.nextInt();
					System.out.println(Comb(l1,l2));
					break;
				case 4:
					System.out.println("entrer entier");
					int f1=sc.nextInt();
					System.out.println(factRe(f1));
					break;
				case 5:
					break;
				default:
					System.out.println("erreur");
					break;
			}
		}while(rep!=5);
	sc.close();
	}	
}