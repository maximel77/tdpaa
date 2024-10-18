package td4PAAexo2;

public enum TauxTVA {
	particulier(2.1),reduit(5.5),intermediaire(10),normal(20);
	private  double value;
	private TauxTVA(double  value) {
		this.value=value;
		
	}
	public double getvalue() {
		return value;
	}

}
