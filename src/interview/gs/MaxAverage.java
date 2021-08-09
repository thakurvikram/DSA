package interview.gs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxAverage {

	public static void main(String[] args) {
		String[][] data = { { "A", "10" }, { "B", "20" }, { "A", "30" }, { "B", "39" } };
		int maxAvg = calculateMaxAvg(data);
		System.out.println(maxAvg);
	}

	private static int calculateMaxAvg(String[][] data) {
		Map<String, List<Integer>> map = new HashMap<>();

		for (int i = 0; i < data.length; i++) {
			List<Integer> l;
			if (map.containsKey(data[i][0])) {
				l = map.get(data[i][0]);
				l.add(Integer.parseInt(data[i][1]));
				map.put(data[i][0], l);
			} else {
				l = new ArrayList<>();
				l.add(Integer.parseInt(data[i][1]));
				map.put(data[i][0], l);
			}
		}

		int maxAvg = Integer.MIN_VALUE;
		for (Map.Entry<String, List<Integer>> e : map.entrySet()) {
			maxAvg = Math.max(maxAvg, getAvg(e.getValue()));
		}

		return maxAvg;
	}

	private static int getAvg(List<Integer> l) {
		
		double avg = l.stream().mapToInt(i -> i).average().orElse(0.0);
		
		/*
		 * double sum = 0; for (int i : l) { sum += i; } double i = sum/l.size();
		 */
		return (int) Math.floor(avg);
	}
	
}
