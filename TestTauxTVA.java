package td4PAAexo2;

public class TestTauxTVA {
	public static void main(String args[]) {
		TauxTVA t=TauxTVA.particulier;
		System.out.println(t.getvalue());
		System.out.println(TauxTVA.normal.getvalue());
	}

}
