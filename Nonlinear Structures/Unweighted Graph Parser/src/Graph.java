
public class Graph {
	
	private Node[] vertices;
	private int totalNodes;
	
	public Graph(int vertices) {
		this.vertices = new Node[vertices];
		totalNodes = 0;
	}
	
	public void addNode(Node node) {
		vertices[totalNodes] = node;
		totalNodes++;
	}
	
	public Node vertice(int index) {
		return vertices[index];	
	}
	
	public void iterate() {
		for (Node n : vertices) {
			n.displayEdges();
		}
	}
	
}
