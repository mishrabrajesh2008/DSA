package hashtables_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Debug this

public class GroupAnagram {

	public static List<List<String>> groupAnagrams(String[] strings) {
		Map<String, List<String>> anagramGroups = new HashMap<>();
		for (String str : strings) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String canonical = String.copyValueOf(chars);
			if (anagramGroups.containsKey(canonical)) {
				anagramGroups.get(canonical).add(str);
			} else {
				List<String> group = new ArrayList<>();
				group.add(str);
				anagramGroups.put(canonical, group);
			}
		}
		return new ArrayList<>(anagramGroups.values());
	}

	public static void main(String[] args) {
		System.out.println("1st set:");
		System.out.println(groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));

		System.out.println("\n2nd set:");
		System.out.println(groupAnagrams(new String[] { "abc", "cba", "bac", "foo", "bar" }));

		System.out.println("\n3rd set:");
		System.out.println(
				groupAnagrams(new String[] { "listen", "silent", "triangle", "integral", "garden", "ranged" }));

		/*
		 * EXPECTED OUTPUT: ---------------- 1st set: [[eat, tea, ate], [tan, nat],
		 * [bat]]
		 * 
		 * 2nd set: [[abc, cba, bac], [foo], [bar]]
		 * 
		 * 3rd set: [[listen, silent], [triangle, integral], [garden, ranged]]
		 * 
		 */

	}

}
