package td4PAA;

public abstract class Figure {
	public abstract double perimetre() ;
	public abstract double surface();
	public abstract Figure translation(Vecteur vec);
	public String toString() {
		return" perimetre:"+perimetre()+"; surface : "+ surface();
	}
		
	
	

}
