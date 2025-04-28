package dynamicprogramming;

import java.util.Scanner;

public class LongestIncreasingSubs {
	
	//10,9,2,5,3,7,101, 18
	
	public static int LIS(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0]=1;
		int ans=0;
		for(int i=1;i<arr.length;i++) {
			int len=0;
			for(int j=0; j<i;j++) {
				if(arr[j]<arr[i]) {
					len = Math.max(len, dp[j]);
				}
			}
			dp[i]=1+len;
			ans = Math.max(ans, dp[i]);
		}
		return ans;
	}
	
	
	
	public static void main(String[] args) {
		System.out.print(" Enter you array length: " );
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print(" Enter array element "+i+": " );
			arr[i] = sc.nextInt();
		}
		int result = LIS(arr);
		sc.close();
		System.out.println("Longest increasing subsequence length: "+result);
	}
			
			
	

}
