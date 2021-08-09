package programming.practice.string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		char c = firstUniqChar("abcdabcabcfabc");
		System.out.println(c);

	}

	private static char findFirstUniqueChar(String str) {
		char ch = 0;

		char[] chars = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(chars[i]) == str.lastIndexOf(chars[i]))
				return chars[i];
		}

		return ch;
	}
	
	private static char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)) map.put(ch, map.get(ch)+1);
            else map.put(ch, 1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1) return s.charAt(i);
        }
        return 0;
    }

}

/**
 * 
 * abcdabcacbacbafcb - d
 * 
 * char array add all the chars in map with counter get the values from map with
 * count 1
 * 
 */
