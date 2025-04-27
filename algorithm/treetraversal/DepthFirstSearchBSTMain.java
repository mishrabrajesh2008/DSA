package treetraversal;

public class DepthFirstSearchBSTMain {
	public static void main(String[] args) {
		DepthFirstSearchBST dfs = new DepthFirstSearchBST();
		
		dfs.insert(47);
		dfs.insert(21);
		dfs.insert(76);
		dfs.insert(18);
		dfs.insert(27);
		dfs.insert(52);
		dfs.insert(86);
		
		System.out.println("DFS PreOrder Traverse: " + dfs.DFSPreOrder());
		System.out.println("DFS PostOrder Traverse: " + dfs.DFSPostOrder());
		System.out.println("DFS PostOrder Traverse: " + dfs.DFSInOrder());
	}

}
