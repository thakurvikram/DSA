package dsa.learning.techgig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeDiff {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int inputLength = sc.nextInt();

		if (inputLength > 0) {
			List<String> list = new ArrayList<String>(inputLength);
			sc.nextLine();
			for (int i = 0; i < inputLength; i++) {
				String str = sc.nextLine();
				list.add(str);
			}

			getPrimeRange(list);
		}

	}

	private static void getPrimeRange(List<String> list) {

		for (String str : list) {
			if (str != null && str != "") {
				String[] split = str.split("\\s");
				int n1 = Integer.parseInt(split[0]);
				int n2 = Integer.parseInt(split[1]);

				if (n1 > n2) {
					System.out.println(-1);
				} else if (n1 == n2) {
					if (isPrime(n1)) {
						System.out.println(0);
					}
				} else {
					int firstPrime = findPrime(n1, true);
					int lastPrime = findPrime(n2, false);
					if (lastPrime < firstPrime) {
						System.out.println(-1);
					} else {
						System.out.println(lastPrime - firstPrime);
					}
				}
			}
		}

	}

	private static int findPrime(int n, boolean forward) {
		int firstPrime = 0;
		if (isPrime(n)) {
			firstPrime = n;
		} else {
			while (!isPrime(n)) {
				if (forward)
					n++;
				else
					n--;
			}
			firstPrime = n;
		}
		return firstPrime;
	}

	private static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}
}
