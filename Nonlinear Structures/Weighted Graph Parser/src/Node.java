import java.util.HashMap;
import java.util.Map;

public class Node {
	
	private String label;
	private Map<Node, Integer> edges = new HashMap<Node, Integer>();
	private int degree;
	
	
	public Node (String label) {
		this.label = label;
		degree = 0;
	}
	
	public void addEdge(Node node, int weight) {
		edges.put(node, weight);
	}
	
	public void displayEdges() {
		String line = "{";
		for (Map.Entry<Node, Integer> entry : edges.entrySet()) {
			line += label + "<-" + entry.getValue() + 
			"->" + entry.getKey().getLabel() + ", ";
		}
		line = line.substring(0, line.length() - 2) + "}";
		System.out.println(line);
	}
	
	public String getLabel() {
		return label;
	}
	
	public int getDegree() {
		return degree;
	}
}
