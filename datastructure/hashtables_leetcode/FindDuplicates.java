package hashtables_leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicates {
	
	public static List<Integer> findDuplicates(int[] nums){
		List<Integer> myList = new ArrayList<Integer>();
		HashMap<Integer, Boolean> myMap = new HashMap<>();
		
		 for(int i: nums) {
			 if(myMap.containsKey(i) && !myList.contains(i)) {
				 myList.add(i);
			 }else {
				 myMap.put(i, true);
			 }
		 }
		return myList;
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
		int[] nums1 = {1,1,1,1};
		List<Integer> duplicates = findDuplicates(nums);
        List<Integer> duplicates1 = findDuplicates(nums1);
        System.out.println(duplicates); 
        System.out.println(duplicates1); 

	}

}
