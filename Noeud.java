package td6;

public class Noeud<E> {
	private E value;
	private Noeud<E> next;
	public Noeud(E v) {
		this.value=v;
	}
	public Noeud(E v,Noeud<E> n) {
		this.value=v;
		this.next=n;
	}
	public void setNext(Noeud <E> n) {
		this.next= n;
	}
	public Noeud<E> getNext(){
		return next;
	}
	public E getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "valeur:"+value;
	}

}
