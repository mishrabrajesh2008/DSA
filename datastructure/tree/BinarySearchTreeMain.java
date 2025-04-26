package tree;

public class BinarySearchTreeMain {
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("Value of root node is: " + bst.root);
		
		bst.insert(47);
		bst.insert(21);
		bst.insert(76);
		bst.insert(18);
		bst.insert(27);
		bst.insert(52);
		bst.insert(86);
		
		System.out.println(bst.root.left.right.value);
		System.out.println("result of contains method: " +bst.contains(18));
	}
	
}
