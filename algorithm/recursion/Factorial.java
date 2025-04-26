package recursion;

import java.util.Scanner;

public class Factorial {

	public static int fact(int n) {

		if (n == 1)
			return 1;
		return n * fact(n - 1);

	}

	public static void main(String[] args) {
		System.out.print("Enter number to calculate fact: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = fact(n);
		System.out.println("Factorial is: " + result);
		sc.close();

	}

}
