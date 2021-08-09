package programming.practice.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {
		Map<String, Integer> wordCount = wordCount("java map class java map class java map list object object set");
		//System.out.println(wordCount);

		// wordCount.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		// wordCount.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		//wordCount.entrySet().stream().sorted(Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
		
		/*
		 * Set<Entry<String, Integer>> entrySet = wordCount.entrySet(); List l = new
		 * ArrayList<>(entrySet);
		 * 
		 * l.sort(Entry.comparingByKey()); System.out.println(l);
		 */
		
		System.out.println("v".compareTo("V"));
	}

	private static Map<String, Integer> wordCount(String str) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		if (str.isEmpty())
			return null;

		String[] words = str.split("\\s");
		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}

		return map;
	}
}
