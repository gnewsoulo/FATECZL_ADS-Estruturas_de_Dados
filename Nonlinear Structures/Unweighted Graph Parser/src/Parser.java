import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Parser {
	private int[][] matrix;
	private int length;
	private Graph graph;
	private final String labels = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static BufferedReader reader;
	
	public Parser(String filename) throws IOException {
		String singleLine = lineParse(filename);
		
		if (testSquare(singleLine)) {
			length = (int) Math.sqrt(singleLine.length());
			matrix = generateMatrix(filename); 
			buildGraph();
		} else {
			System.out.println("Your matrix is not square. Please enter a square matrix!");
		}
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
		reader.close();
		return matrix;
	}
	
	private String lineParse(String filename) throws IOException {
		String singleLine = "";
		
		reader = new BufferedReader(new FileReader(filename));
		
		String line = reader.readLine();
		
		while (line != null) {
			String[] tempLine = line.split(",");
			for (int i = 0; i < tempLine.length; i++) {
				singleLine += tempLine[i];
			}
			line = reader.readLine();
		}
		reader.close();
		return(singleLine);
	}
	
	private boolean testSquare(String singleLine) {
		double squaredLength = Math.sqrt(singleLine.length());
		return (squaredLength == Math.floor(squaredLength));
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
				if (matrix[i][j] == 1) {
					graph.vertice(i).addEdge(graph.vertice(j));
				}
			}
		}
	}
	
	public Graph graph() {
		return graph;
	}
}
