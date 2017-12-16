package BST;

public class Tree {
	Node mRoot;
	int mSize;
	
	public Tree() {
		mRoot = null;
		mSize = 0;
	}
	
	int getSize() {
		return mSize;
	}
	
	boolean contains(int value) {
		// If the tree is empty, automatically return false
		if (mSize == 0) {
			return false;
		}
		// Otherwise, search tree
		else {
			return containsRecursive(mRoot, value);
		}
	}
	
	boolean containsRecursive(Node node, int value) {
		// Check if this node equals the value
		if (node.getValue() == value) {
			return true;
		}
		// If the node is a leaf, then return false (base case in recursion)
		else if (node.getLeft() == null && node.getRight() == null) {
			return false;
		}
		// Check left subtree
		else if (value < node.getValue()) {
			return containsRecursive(node.getLeft(), value);
		}
		// Otherwise, check right subtree
		else {
			return containsRecursive(node.getRight(), value);
		}
	}
	
	void insert(int value) {
		// Create a new node filled with inputed value
		Node newNode = new Node(value);
		
		// If the tree is empty...
		if (mRoot == null) {
			// Make newNode the root of the tree
			mRoot = newNode;
			mSize += 1;
		}
		// Otherwise...
		else {
			// Set current node to the root node before beginning the recursive process
			Node currNode = mRoot;
			
			// Use boolean to check when node has been inserted
			boolean inserted = false;
			
			// While the node hasn't been inserted... 
			while (!inserted) {
				// If the value equals the current node...
				if (currNode.getValue() == value){
					// Do nothing (duplicate values are not added to the tree)
					inserted = true;
				}
				// If the value is less than that of the current node...
				else if (value < currNode.getValue()) {
					// If current has no left child node...
					if (currNode.getLeft() == null) {
						// Add this new node to the left of current node
						currNode.setLeft(newNode);
						mSize += 1;
						inserted = true;
					}
					// Otherwise, if current has a left child node...
					else {
						// Repeat this process with currNode.getLeft() as currNode
						currNode = currNode.getLeft();
					}
					// Repeat process for left subtree
				}
				// Otherwise, if the value is greater than the current node...
				else {
					// If current has no right child node...
					if (currNode.getRight() == null) {
						// Add this new node to the right of current node
						currNode.setRight(newNode);
						mSize += 1;
						inserted = true;
					}
					// Otherwise, if current has a right child node...
					else {
						System.out.println("Inserting node: " + newNode.getValue());
						// Repeat this process with currNode.getRight() as currNode
						currNode = currNode.getRight();
					}
				}
			}
		}
	}
	
	void printTree() {
		// If tree is empty...
		if (mSize == 0) {
			// Print that the tree is empty
			System.out.println("The tree is empty.");
		}
		else {
			// Print nodes in tree using an in order traversal
			System.out.print("Ordered contents of the tree: ");
			printInOrder(mRoot);
			System.out.println();
		}
		
	}
	
	void printInOrder(Node node) {
		// If the node is null...
		if (node == null) {
			// Don't do anything
			return;
		}
		
		// Print left subtree
		printInOrder(node.getLeft());
		
		// Print current node
		System.out.print(node.getValue() + " ");
		
		// Print right subtree
		printInOrder(node.getRight());
	}
	
	void remove(int value) {
		System.out.println("Sorry, I don't actually know how to remove yet. Check back later.");
	}
	
}