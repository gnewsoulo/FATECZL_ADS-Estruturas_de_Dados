import java.util.ArrayList;

public class Node {
	
	private String label;
	private ArrayList<Node> edges = new ArrayList<Node>();
	private int degree;
	
	
	public Node (String label) {
		this.label = label;
		degree = 0;
	}
	
	public void addEdge(Node node) {
		edges.add(node);
	}
	
	public void displayEdges() {
		String line = "{";
		for (Node n : edges) {
			line += label + "<->" + n.getLabel() + ", ";
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
