package BST;
import java.util.Scanner; 

public class Main {

	public static void main( String[] args ) {
		
		// Initialize tree object
		Tree tree = new Tree();
		
		// Declare String input to later use in while loop
		String input;
		
		// Create scanner to read user input
		Scanner user_input = new Scanner(System.in);
		
		// Display option information for the user
		System.out.println("Hello, this is my binary search tree.");
		System.out.println("You can either [i]nsert, [r]emove, [p]rint, or [q]uit.");
		System.out.println("Enter one of the letters i, r, p, or q: ");
		
		// While the user has not quit...
		while (!(input = user_input.next()).equals("q")) {
			// If "i" is input, perform the insertion option
			if (input.equals("i")) {
				System.out.println();
				System.out.println("What value would you like to insert: ");
				int value = user_input.nextInt();
				tree.insert(value);
				System.out.println();
				System.out.println("Great, that value has been inserted. ");
			}
			// If "r" is selected, perform the remove option
			else if (input.equals("r")) {
				System.out.println();
				System.out.println("What value would you like to remove: ");
				int value = user_input.nextInt();
				// Check if value is in tree. If not...
				if (!tree.contains(value)) {
					System.out.println("Sorry, this value is not in the tree.");
				}
				// Otherwise...
				else {
					tree.remove(value);
					System.out.println();
				}
			}
			// If "p" is selected, perform the print option
			else if (input.equals("p")) {
				// Print the tree
				tree.printTree();
			}
			// If none of these are selected, let the user know they made a mistake
			else {
				System.out.println("Sorry, that is not one of the options.");
				System.out.println();
			}
			
			System.out.println("What else would you like to do? ");
			System.out.println("Enter one of the letters i, r, p, or q: ");
		}
		
	}
	
}