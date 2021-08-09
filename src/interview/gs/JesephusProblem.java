package interview.gs;

import java.util.ArrayList;
import java.util.List;

public class JesephusProblem {

	static int josephus(List<Integer> n, int start, int k) {
		if(n.size() == 1) return n.get(0);
		
		else {
			start = (start + k) % n.size();
			n.remove(start);
			return josephus(n, start, k);
		}
		
	}

	// Driver Program to test above function
	public static void main(String[] args) {
		int n = 16;
		List l = new ArrayList<Integer>();
		for(int i =1; i <=14;i++) {
			l.add(i);
		}
		int k = 1;
		System.out.println("The chosen place is " + josephus(l,1, k));
	}

}
