package exo2td6;
import java.util.List;
import java.util.ArrayList;
public class Liste {
	public static int Max(List<Integer>l1) {
		int max =l1.get(0);
		for(int elem:l1) {
			if(elem>max) {
				max=elem;
			}
		}
		return max;
	}
	public static int  Moyenne(List<Integer>l1) {
		int somme=0;
		for(int elem:l1) {
			somme+=elem;
		}
		return somme/l1.size();
	}
	public static List<Integer> tri(List<Integer>l1){
		List<Integer>  copy= new ArrayList<>();
		copy.add(l1.get(0));
		for(int elem:l1) {
			for(int i=1;i<copy.size();i++)
		}
		
		
	}

}
