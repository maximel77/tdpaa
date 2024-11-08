package exo3td6;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.lang.StringBuilder;
public class Graphe<T> {
	private Map<T,ArrayList<T>> graph;
	
	public Graphe() {
		this.graph= new HashMap<T,ArrayList<T>>();
	}
	public boolean ajouterNoeud(T noeud) {
		if(!graph.containsKey(noeud)) {
			graph.put(noeud, new ArrayList<>());
			return true;
		}
		else {
			return false;
		}
		
		
	}
	public boolean ajouterArc(T noeud1, T noeud2) {
		if(graph.containsKey(noeud2)&&graph.containsKey(noeud2)) {
			if(!(graph.get(noeud1).contains(noeud2))) {
				graph.get(noeud1).add(noeud2);
				graph.get(noeud2).add(noeud1);
				return true;
			}
			else{
				return false;
			}
		}
		else {
			System.out.println("un des  noeuds n'appartient pas a la liste");
			return false;
		}
		
	}
	public boolean ArcPresent(T noeud1, T noeud2) {
		return graph.containsKey(noeud1)&& graph.get(noeud1).contains(noeud2);
	}
	@Override
	public String  toString() {
		StringBuilder s= new StringBuilder();
		for(Map.Entry<T,ArrayList<T>> entry:graph.entrySet()) {
			s.append(entry.getKey()).append(":").append(entry.getValue());
			s.append("\n");
			
		}
		return s.toString();
		
	}
			
	
}
