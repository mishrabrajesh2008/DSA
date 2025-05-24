package hashtables_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPairsSet {

	public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
		Set<Integer> resultSet = new HashSet<>();
		List<int[]> pairs = new ArrayList<int[]>();

		for (int num : arr1)
			resultSet.add(num);

		for (int num : arr2) {
			int complement = target - num;
			if (resultSet.contains(complement))
				pairs.add(new int[] { complement, num });
		}

		return pairs;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 2, 4, 6, 8, 10 };
		int target = 7;

		List<int[]> pairs = findPairs(arr1, arr2, target);
		for (int[] pair : pairs) {
			System.out.println(Arrays.toString(pair));
		}

		/*
		 * EXPECTED OUTPUT: ---------------- [5, 2] [3, 4] [1, 6]
		 * 
		 */

	}

}
