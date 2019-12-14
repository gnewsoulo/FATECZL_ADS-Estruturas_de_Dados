import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		String filename = "Entry.txt";
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		
		
		String line = reader.readLine();
		int totalOps = line.charAt(0) - '0';
		
		Operation[] ops = new Operation[totalOps];
		
		for(int i = 0; i < totalOps; i++) {
			line = reader.readLine();
			String operation = reader.readLine();
			ops[i] = new Operation(operation.charAt(0));
			int terms = reader.readLine().charAt(0) - '0';
			if (operation.charAt(0) == 'V') {
			
				Polynomial poly = new Polynomial(terms);
				String[] allTerms = reader.readLine().split(" ");
				for (int j = 0; j < allTerms.length; j += 2) {
					double coef = Double.parseDouble(allTerms[j]);
					double degree = Double.parseDouble(allTerms[j+1]);
					Node node = new Node(coef, degree);
					poly.addTerm(node);
				}
				line = reader.readLine();
				double x = Double.parseDouble(line);
				ops[i].setX(x);
				ops[i].addPolynomial(poly);
				
			} else if (operation.charAt(0) == 'S'){
				for (int d = 0; d < 2; d++) {
					if (terms == 0) {
						Polynomial poly = new Polynomial(1);
						Node node = new Node(0.0, 0.0);
						poly.addTerm(node);
						ops[i].addPolynomial(poly);
						terms = reader.readLine().charAt(0) - '0';
					} else {
						Polynomial poly = new Polynomial(terms);
						String[] allTerms = reader.readLine().split(" ");
						for (int j = 0; j < allTerms.length; j += 2) {
							double coef = Double.parseDouble(allTerms[j]);
							double degree = Double.parseDouble(allTerms[j+1]);
							Node node = new Node(coef, degree);
							poly.addTerm(node);
						}
						ops[i].addPolynomial(poly);
					}					
				}
			}
			
		}
		reader.close();
		
		for (int i = 0; i < totalOps; i++) {
			ops[i].display();
		}		
	}
}
