
public class Node {
	private Node next;
	private double coeff;
	private double degree;
	
		
	public Node(double coeff, double degree) {
		next = (Node) null;
		this.coeff = coeff;
		this.degree = degree;
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public double getCoeff() {
		return coeff;
	}
	
	public void setCoeff(double coeff) {
		this.coeff = coeff;
	}
	
	public double getDegree() {
		return degree;
	}
	
	public void setDegree(double degree) {
		this.degree = degree;
	}
	
}
