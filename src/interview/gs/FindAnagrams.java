package interview.gs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class FindAnagrams {

	private static ArrayList<ArrayList<String>> solver(ArrayList<String> list) {

		// Inner hashmap counts frequency
		// of characters in a string.
		// Outer hashmap for if same
		// frequency characters are present in
		// in a string then it will add it to
		// the arraylist.
		HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<HashMap<Character, Integer>, ArrayList<String>>();
		for (String str : list) {
			HashMap<Character, Integer> tempMap = new HashMap<Character, Integer>();

			// Counting the frequency of the
			// characters present in a string
			for (int i = 0; i < str.length(); i++) {
				if (tempMap.containsKey(str.charAt(i))) {
					int x = tempMap.get(str.charAt(i));
					tempMap.put(str.charAt(i), ++x);
				} else {
					tempMap.put(str.charAt(i), 1);
				}
			}

			// If the same frequency of chanracters
			// are alraedy present then add that
			// string into that arraylist otherwise
			// created a new arraylist and add that string
			if (map.containsKey(tempMap))
				map.get(tempMap).add(str);
			else {
				ArrayList<String> tempList = new ArrayList<String>();
				tempList.add(str);
				map.put(tempMap, tempList);
			}
		}

		// Stores the result in a arraylist
		ArrayList<ArrayList<String>> result = new ArrayList<>();
		for (HashMap<Character, Integer> temp : map.keySet())
			result.add(map.get(temp));
		return result;
	}

	// Drivers Method
	public static void main(String[] args) {
		/*
		 * ArrayList<String> list = new ArrayList<>(); list.add("cat"); list.add("dog");
		 * list.add("ogd"); list.add("god"); list.add("atc");
		 */

		//System.out.println(solver(list));
		
		char[] arr = "abcdefg".toCharArray();
	    List<Character> list = new LinkedList<>(); // copy the chars to a list
	    for (int i = 0; i < arr.length; i++) {
	        list.add(arr[i]);
	    }
	    Collections.shuffle(list);  // use to shuffle
	    for (int i = 0; i < arr.length; i++) { // copy the shuffled chars back to the array
	        arr[i] = list.get(i);
	    }
	    System.out.println(new String(arr));
	}
}