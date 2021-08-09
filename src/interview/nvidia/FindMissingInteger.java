package interview.nvidia;

import java.util.ArrayList;
import java.util.List;

public class FindMissingInteger {

	public static void main(String[] args) {

		List<Integer> l= new ArrayList<>();
		
		for(int i = 1; i <= 5; i++) {
			l.add(i);
		}
		
		l.remove(4);
		int n = findMissingInt(l, 5);
		System.out.println(n);
	}

	private static int findMissingInt(List<Integer> l, int N) {

		int currSum = l.stream().mapToInt(i -> i).sum();
		
		int actualSum = N*(N+1)/2;
		
		return actualSum-currSum;
	}

}
