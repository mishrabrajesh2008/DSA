package treetraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BreadthFirstSearchBST {

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
	
	public ArrayList<Integer> BFS(){
		Node currentNode = root;
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Integer> results = new ArrayList<Integer>();
		queue.add(currentNode);
		while (queue.size()>0) {
			currentNode=queue.remove();
			results.add(currentNode.value);
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
		}
		return results;
	}
	
}
