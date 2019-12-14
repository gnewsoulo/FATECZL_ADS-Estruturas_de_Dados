
public class Operation {
	private char type;
	private Polynomial[] poly;
	private double x;
	
	public Operation(char type) {
		this.type = type;
		
		if (type == 'V') {
			poly = new Polynomial[1];
		} else {
			poly = new Polynomial[2];
		}
	}
	
	public void addPolynomial(Polynomial poly) {
		this.poly[0] = poly;
	}
	
	public void addPolynomial(Polynomial poly, int index) {
		this.poly[index] = poly;
	}
	
	public void setX(double value) {
		x = value;
	}
	
	public void display() {
		if (type == 'V') {
			System.out.println("P(x) = " + poly[0].display());
			int terms = poly[0].getTotalTerms();
			double result = 0;
			for (int i = 0; i < terms; i++) {
				double aux = poly[0].getTerms()[i].getCoeff();
				aux *= Math.pow(x, poly[0].getTerms()[i].getDegree());
				result += aux;
			}
			System.out.println("P(" + x + ") = " + result);
		} else {
			String result = "P(x) = ";
			for (Polynomial p: poly) {
				result += p.display() + " + "; 
			}			
			result = result.substring(0, result.length() -2);
			if (result.contains("+ -")) {
				int index = result.indexOf("+ -");
				result = result.substring(0, index) + "-" + result.substring(index+1);
			}
		}
	}
}
