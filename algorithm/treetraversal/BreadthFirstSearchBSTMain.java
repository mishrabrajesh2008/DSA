package treetraversal;


public class BreadthFirstSearchBSTMain {
	
	public static void main(String[] args) {
		BreadthFirstSearchBST bst = new BreadthFirstSearchBST();
		
		bst.insert(47);
		bst.insert(21);
		bst.insert(76);
		bst.insert(18);
		bst.insert(27);
		bst.insert(52);
		bst.insert(86);
		
		System.out.println("BFS Traverse: " +bst.BFS());
		
	}

}
