import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Parser {
	private int[][] matrix;
	private int length;
	private Graph graph;
	private final String labels = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static BufferedReader reader;
	
	public Parser(String filename) throws IOException {
		checkLength(filename);
		matrix = generateMatrix(filename); 
		buildGraph();
	}
	
	private void checkLength(String filename) throws IOException {
		reader = new BufferedReader(new FileReader(filename));
		
		String[] line = reader.readLine().split(","); 
		
		length =  line.length;
	}
	
	private int[][] generateMatrix(String filename) throws IOException {
		int[][] matrix = new int[length][length];
		
		reader = new BufferedReader(new FileReader(filename));
		
		for (int i = 0; i < length; i++) {
			String[] line = reader.readLine().split(",");
			for (int j = 0; j < length; j++) {
				String num = "" + line[j];
				matrix[i][j] = Integer.parseInt(num);
			}
		}
		return matrix;
	}
	
	private void buildGraph() {
		graph = new Graph(length);
		
		for (int i = 0; i < length; i++) {
			String label = "" + labels.charAt(i);
			Node node = new Node(label);
			graph.addNode(node);
		}
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (matrix[i][j] != 0) {
					graph.vertice(i).addEdge(graph.vertice(j), matrix[i][j]);
				}
			}
		}
	}
	
	public Graph graph() {
		return graph;
	}
}
