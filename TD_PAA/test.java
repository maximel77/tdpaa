package td2;
import java.lang.StringBuilder;

public class test {
	
	public static String remplaceLettre(String str, String sousch1, String sousch2) {
		StringBuilder s= new StringBuilder(str);
		int seq=1;
		int index = s.indexOf(sousch1,seq);
		while(index>0) {
			s.replace(index, index+sousch1.length(), sousch2);
			seq++;
			index=s.indexOf(sousch1,seq);
		}
	
		return s.toString();
	}
		
	public static void main(String args[]) {
		StringBuilder s= new StringBuilder("bon");
		System.out.println(s);
		s.append("jouron");
		System.out.println(remplaceLettre("bonjouron","on","kill"));
		
	}

}
