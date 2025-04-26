package tree;

public class BinarySearchTree {
	
	 Node root;
	
	class Node{
		int value;
		Node right;
		Node left;
		
		Node(int value){
			this.value = value;
		}
	}
	
	/*Create new Node
	 * if root = null root = new node
	 * temp = root
	 * while loop
	 * if newNOde ==temp return false
	 * if < go left else go right
	 * if null insert new node else move next
	 * for loop is needed when we know how many steps to iterate through else use while loop
	 */
	
	public boolean insert(int value) {
		Node newNode = new Node(value);
		if(root == null) {
			root = newNode;
			return true;
		}		
		
		Node temp =root;
		
		while(true) {
			if(newNode == temp)
				return false;
			if(newNode.value<temp.value) {
				if(temp.left==null) {
					temp.left= newNode;
					return true;
				}
				temp=temp.left;
			}else {
				if(temp.right==null) {
					temp.right= newNode;
					return true;
				}
				temp=temp.right;
			}
				
		}
	}
	
	/*
	 * if root = null return false
	 * temp = root
	 * while temp!= null
	 * if < go left else if> go right
	 * else return true;
	 * for loop is needed when we know how many steps to iterate through else use while loop
	 */
	public boolean contains(int value) {
		if(root == null) return false;
		Node temp = root;
		while(temp!=null) {
			if(value<temp.value) {
				temp = temp.left;
			}else if(temp.value>value) {
					temp=temp.right;
				}else
					return true;
			}
		return false;
	}

}
