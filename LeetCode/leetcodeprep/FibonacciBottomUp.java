package leetcodeprep;

import java.util.Scanner;

// Most efficient way of coding
public class FibonacciBottomUp {
	
	
	static int counter = 0;
	
	public static int fib(int n) {
		int[] fibList = new int[n+1];
		fibList[0] = 0;
		fibList[1] = 1;
		
		
		
		for(int index=2;index <= n;index++) {
			counter++;
			fibList[index] = fibList[index-1] + fibList[index-2];
		}

	
	return fibList[n];
	}
	
	public static void main(String[] args) {
		System.out.print("Enter number to calculate fibonacci: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int result = fib(n);
		System.out.println("Fibanacci is : " + result);
		System.out.println("Counter: " + counter);
		sc.close();
		
	}

}
