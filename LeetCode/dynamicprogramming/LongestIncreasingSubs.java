package dynamicprogramming;

import java.util.Scanner;

public class LongestIncreasingSubs {
	
	//10,9,2,5,3,7,101, 18
	
	
	
	public static void main(String[] args) {
		System.out.print(" Enter you array length: " );
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
	}
			
			
	

}
