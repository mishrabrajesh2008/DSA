package treetraversal;

import java.util.ArrayList;

public class DepthFirstSearchBST {
	public Node root;
	
	class Node{
		public int value;
		public Node left;
		public Node right;
		
		Node(int value){
			this.value = value;
		}
	}
	
	public boolean insert(int value) {
		Node newNode = new Node(value);
		if(root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;
		while(true) {
			if(newNode == temp)
				return false;
			if(newNode.value<temp.value) {
				if(temp.left==null) {
					temp.left = newNode;
					return true;
				}
				temp=temp.left;
			}else {
				if(temp.right==null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}
		}
	}

	public ArrayList<Integer> DFSPreOrder(){
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		class Traverse{
			Traverse(Node currentNode){
				results.add(currentNode.value);
				if(currentNode.left!=null) {
					new Traverse(currentNode.left);
				}
				if(currentNode.right!=null) {
					new Traverse(currentNode.right);
				}
			}
		}
		
		new Traverse(root);
		return results;
	}
	
	public ArrayList<Integer> DFSPostOrder(){
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		class Traverse{
			Traverse(Node currentNode){
				if(currentNode.left!=null) {
					new Traverse(currentNode.left);
				}
				if(currentNode.right!=null) {
					new Traverse(currentNode.right);
				}
				results.add(currentNode.value);
			}
		}
		
		new Traverse(root);
		return results;
	}
	
	public ArrayList<Integer> DFSInOrder(){
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		class Traverse{
			Traverse(Node currentNode){
				if(currentNode.left!=null) {
					new Traverse(currentNode.left);
				}
				results.add(currentNode.value);
				if(currentNode.right!=null) {
					new Traverse(currentNode.right);
				}
				
			}
		}
		
		new Traverse(root);
		return results;
	}
	
}
