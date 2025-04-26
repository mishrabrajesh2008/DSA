package recursion;

import java.util.Scanner;


public class RecBSTMain {

	public static void main(String[] args) {
		RecBST bst = new RecBST();
		
		bst.insert(47);
		bst.insert(21);
		bst.insert(76);
		bst.insert(18);
		bst.insert(27);
		bst.insert(52);
		bst.insert(86);
		
		
		System.out.print("Enter node value to search: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean result = bst.rContains(n);
		System.out.println("Node contains value =  " + result);
		sc.close();

	}

}
