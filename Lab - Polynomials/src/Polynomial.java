
public class Polynomial {
	private Node[] terms;
	private int totalTerms;
	
	public Polynomial(int terms) {
		this.terms = new Node[terms];
	}
	
	public void addTerm(Node node) {
		if (terms.length == totalTerms) {
			System.out.println("You can't add more terms to this polynomial!");
		} else {
			terms[totalTerms] = node;
			totalTerms++;
		}
	}
	
	public String display() {
		String fullPoly = "";
		for (Node n : terms) {
			fullPoly += n.getCoeff() + "x^" + n.getDegree() + " + ";
		}
		return fullPoly.substring(0, fullPoly.length()-3);
	}
	
	public int getTotalTerms() {
		return terms.length;
	}
	
	public Node[] getTerms() {
		return terms;
	}
}
