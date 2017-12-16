package BST;

public class Node {
	int data;
	Node left;
	Node right;
	
	public Node(int input) {
		data = input;
		left = null;
		right = null;
	}
	
	Node getLeft() {
		return left;
	}
	
	Node getRight() {
		return right;
	}
	
	int getValue() {
		return data;
	}
	
	void setValue(int value) {
		data = value;
	}
	
	void setLeft(Node node) {
		left = node;
	}
	
	void setRight(Node node) {
		right = node;
	}
	
}