package td6;
import java.lang.StringBuilder;
public class ListeChainee<E> {
	private Noeud<E> head;
	public ListeChainee(Noeud<E> n) {
		this.head=n;
	}
	public void add(E valeur) {
		Noeud<E> copy=head;
		while(copy.getNext()!=null) {
			copy=copy.getNext();
		}
		copy.setNext(new Noeud<E>(valeur));
	}
	
	public Noeud<E> get(int index){
		int compteur=0;
		Noeud<E> copy=head;
		while(compteur<index &&copy.getNext()!=null) {
			compteur++;
			copy=copy.getNext();
		}
		if(compteur==index) {
			return copy;
		}
		return null;
			
	}
	public void insert(E valeur, int position) {
		Noeud <E> copy1= head;
		
		int compteur=0;
		Noeud<E> nv= new Noeud<>(valeur);
		if(position<=0) {
			nv.setNext(head);
			this.head=nv;
		}
		else {
			while(copy1.getNext()!=null) {
				if(compteur+1==position) {
					Noeud <E> buffer= copy1.getNext();
					copy1.setNext(nv);
					nv.setNext(buffer);
				}
				
				compteur++;
				copy1=copy1.getNext();
				
			}
			if(compteur+1==position) {
				copy1.setNext(nv);
			}
			else if (compteur+1<position) {
				System.out.println("erreu position trop haute");
			}
		}
	}
	public void remove(int position) {
		int compteur=0;
		if(position==0) {
			this.head=head.getNext();
		}
		else {
			Noeud <E> copy1=head;

			while(copy1.getNext()!= null && copy1.getNext().getNext()!=null) {
				if(compteur+1==position) {
					copy1.setNext(copy1.getNext().getNext());
				}
				compteur++;
				copy1=copy1.getNext();
			}
			if(compteur+1==position) {
				copy1.setNext(null);
			}
			if(compteur+1<position) {
				System.out.println("erreur position trop haute");
			}
		}
	}
	
		
		
	
	@Override
	public String toString() {
		StringBuilder s= new StringBuilder();
		Noeud<E> copy= head;
		while(copy.getNext()!=null) {
			s.append(copy.getValue());
			s.append("->");
			copy=copy.getNext();
			
		}
		s.append(copy.getValue());
		return s.toString();
	}
}
