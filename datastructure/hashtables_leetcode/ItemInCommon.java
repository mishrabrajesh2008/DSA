package hashtables_leetcode;

import java.util.HashMap;

public class ItemInCommon {

	public static void main(String[] args) {
		int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        
        int[] array3 = {1, 2, 5};
        int[] array4 = {2, 4, 6};

        System.out.println(itemInCommon(array1, array2));
        
        System.out.println(itemInCommon(array3, array4));
        
        /*
            EXPECTED OUTPUT:
            ----------------
            true

        */
	}

	public static boolean itemInCommon(int[] array1, int[] array2) {
		HashMap<Integer, Boolean> myMap = new HashMap<>();
		
		for(int i: array1) {
			myMap.put(i, true);
		}
		
		for(int j: array2) {
			if(myMap.get(j) != null) return true;
		}
		
		
		return false;
	}

}
