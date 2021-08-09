package interview.gs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMisingPanagramAlphas {

	public static void main(String[] args) {
		String missingAlphas = getMissingAlphas("lmnopqrstuvwxyz");
		System.out.println(missingAlphas);
	}

	private static String getMissingAlphas(String str) {
		Set<String> inputSet = new HashSet<>(Arrays.asList(str.split("")));
		Set<String> alphaSet = new HashSet<>();
		
		String[] alphas = "abcdefghijklmnopqrstuvwxyz".split("");
		
		alphaSet.addAll(Arrays.asList(alphas));
		
		alphaSet.removeAll(inputSet);
		
		return alphaSet.toString();
	}
}
