
public class Node {
	private Node next;
	private double coeff;
	private double degree;
	private double xValue;
	
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

	public double getxValue() {
		return xValue;
	}

	public void setxValue(double xValue) {
		this.xValue = xValue;
	}
	
}
