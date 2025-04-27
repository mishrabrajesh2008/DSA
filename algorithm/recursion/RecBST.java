package recursion;



public class RecBST {
	
	public Node root;
	
	class Node{
		public int value;
		public Node left;
		public Node right;
		
		Node(int value){
			this.value = value;
		}
	}
	
	private boolean rContains(Node currentNode, int value) {
		if(currentNode == null) return false;
		
		if(currentNode.value == value) return true;
		
		if(value<currentNode.value) {
			return rContains(currentNode.left, value);
		}else {
			return rContains(currentNode.right, value);
		}
	}

	public boolean rContains(int value) {
		return rContains(root, value);
	}
	
	public Node rInsert(int value) {
		if(root == null) root = new Node(value);
		return rInsert(root, value);
	}

	private Node rInsert(Node currentNode, int value) {
		if(currentNode == null) return new Node(value);
		if(value<currentNode.value)
			currentNode.left=rInsert(currentNode.left, value);
		else if(value>currentNode.value)
			currentNode.right = rInsert(currentNode.right, value);
			
		return currentNode;
	}
	
	public int minValue(Node currentNode) {
		if(currentNode.left!=null) {
			currentNode = currentNode.left;
		}
		return currentNode.value;
	}
	
	public int maxValue(Node currentNode) {
		if(currentNode.right!=null) {
			currentNode = currentNode.right;
		}
		return currentNode.value;
	}
	
	private Node deleteNode(Node currentNode, int value) {
		if(currentNode == null) return null;
		//delete a value which is not in the tree
		if(value<currentNode.value) {
			currentNode.left = deleteNode(currentNode.left, value);
		}else if(value>currentNode.value) {
			currentNode.left = deleteNode(currentNode.left, value);
		}else {
			if(currentNode.left==null && currentNode.right == null) {
				return null;
			}else if(currentNode.left == null) {
				currentNode = currentNode.right;
			}else if(currentNode.right == null) {
				currentNode = currentNode.left;
			}else {
				int subTreeMin = minValue(currentNode.right);
				currentNode.value = subTreeMin;
				currentNode.right = deleteNode(currentNode.right, subTreeMin);
			}
		}
		return currentNode;
	}
	
	public void deleteNode(int value) {
		deleteNode(root, value);
	}
}
