package td6;
import java.util.ArrayList;
public class main {
	public static void main(String args[]) {
		Noeud<Integer>n3= new Noeud<>(3);
		Noeud<Integer>n2= new Noeud<>(2,n3);
		Noeud<Integer>n1= new Noeud<>(1);
		n1.setNext(n2);
		ListeChainee<Integer> l1= new ListeChainee<>(n1);
		l1.add(4);
		System.out.println(l1.get(2));
		System.out.println(l1);
		l1.insert(8, 4);
		System.out.println(l1);
		l1.remove(4);
		System.out.println(l1);
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(1);
		l2.add(4);
		System.out.println(l2);
		
		
		
	}

}
