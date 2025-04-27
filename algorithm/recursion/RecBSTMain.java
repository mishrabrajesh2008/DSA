package recursion;

import java.util.Scanner;

import recursion.RecBST.Node;


public class RecBSTMain {

	public static void main(String[] args) {
		RecBST bst = new RecBST();
		
		/*
		 * bst.insert(47); bst.insert(21); bst.insert(76); bst.insert(18);
		 * bst.insert(27); bst.insert(52); bst.insert(86);
		 */
		
		bst.rInsert(47);
		bst.rInsert(21);
		bst.rInsert(76);
		bst.rInsert(18);
		bst.rInsert(27);
		bst.rInsert(52);
		bst.rInsert(86);
		
		
		System.out.print("Enter node value to search: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean result = bst.rContains(n);
		System.out.println("Node contains value =  " + result);
		sc.close();
		
		System.out.println("Min value of root: " + bst.minValue(bst.root) );
		System.out.println("Min value from root: " + bst.minValue(bst.root.left) );
		System.out.println("Max value from root: " + bst.maxValue(bst.root.right) );

	}

}
