package dynamicprogramming;

import java.util.Scanner;

//Optimized way of coding
public class FibonacciMemoization {
	
	static Integer[] memo = new Integer[100];
	static int counter = 0;
	
	public static int fib(int n) {
		counter++;
		if(memo[n]!=null) {
			return memo[n];
		}
		if(n==0||n==1) {
		return n;
		
	}

	memo[n] = fib(n-1) + fib(n-2);
	return memo[n];
	}
	
	public static void main(String[] args) {
		System.out.print("Enter number to calculate fibonacci: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int result = fib(n);
		System.out.println("Fibanacci is : "+result);
		System.out.println("Counter: " + counter);
		sc.close();
		
	}
}
