
public class Node {
	
	private String label;
	private Node parent;
	private Node[] children;
	private int degree;
	private int heigth;
	private int level;
	
	public Node (String label) {
		this.label = label;
		degree = 0;
		children[0] = (Node) null;
	}
	
		
	public boolean isParent() {
		return false;
	}
	
	public boolean isLeaf() {
		return (getChildren().length == 0);
	}

	public void branch(Node child) {
		degree += 1;
		Node[] newChildren = new Node[degree];
		for (int i = 0; i < degree; i++) {
			if (i == degree - 1) {
				newChildren[i] = child;  
			} else {
				newChildren[i] = getChildren()[i];
			}
		}
		
		this.setChildren(newChildren);
	}


	public Node[] getChildren() {
		return children;
	}


	public void setChildren(Node[] children) {
		this.children = children;
	}
}
