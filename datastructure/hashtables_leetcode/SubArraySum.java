package hashtables_leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
	
	/*
	 * The idea is to store the sum of elements of every prefix of the array in a
	 * hashmap, i.e, every index stores the sum of elements up to that index
	 * hashmap. So to check if there is a subarray with a sum equal to target_sum,
	 * check for every index i, and sum up to that index as curr_sum. If there is a
	 * prefix with a sum equal to (curr_sum - target_sum), then the subarray with
	 * the given sum is found.
	 * In this case we found a entry in hashmap eaual to (curr_sum - target_sum)
	 */
	
	public static int[] subarraySum(int[] nums, int target) {
		Map<Integer, Integer> subarraySum = new HashMap<>();
			subarraySum.put(0,-1);
			int currentSum = 0;
		for(int i = 0; i<nums.length;i++) {
			currentSum = currentSum+nums[i];	
			if(subarraySum.containsKey(currentSum-target)) {
				return new int[] {subarraySum.get(currentSum-target)+1,i};
			}
			subarraySum.put(currentSum,i);
		}
		return new int[]{};
	}

	public static void main(String[] args) {
		
		int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 9;
        int[] result1 = subarraySum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {-1, 2, 3, -4, 5};
        int target2 = 0;
        int[] result2 = subarraySum(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {2, 3, 4, 5, 6};
        int target3 = 3;
        int[] result3 = subarraySum(nums3, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");

        int[] nums4 = {};
        int target4 = 0;
        //int[] result4 = subarraySum(nums4, target4);
        System.out.println("[]: "+subarraySum(nums4, target4).toString());
        
        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 3]
            [0, 3]
            [1, 1]
            []
    
        */

	}

}
