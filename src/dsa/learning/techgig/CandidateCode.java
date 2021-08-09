package dsa.learning.techgig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateCode {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		String virus = sc.next();
		int inputLength = sc.nextInt();
		List<String> list = new ArrayList<String>(inputLength);

		for (int i = 0; i < inputLength; i++) {
			list.add(sc.next());
		}
		checkVirus(virus, list);
		// Write code here

	}

	private static void checkVirus(String virus, List<String> bloods) {
		for (String blood : bloods) {
			if (blood.length() > virus.length()) {
				System.out.println("NEGATIVE");
			} else {
				if (checkSubString(virus, blood)) {
					System.out.println("POSITIVE");
				} else {
					System.out.println("NEGATIVE");
				}
			}
		}
	}

	private static boolean checkSubString(String virus, String blood) {
		char[] chars = blood.toCharArray();

		int start = 0;

		for (int i = 0; i < blood.length(); i++) {
			virus = virus.substring(start);
			if (virus.contains(String.valueOf(chars[i]))) {
				start = virus.indexOf(String.valueOf(chars[i]));
			} else {
				return false;
			}
		}
		return true;
	}
}
