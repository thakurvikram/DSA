package programming.practice.string;

public class AppDirect {

	public static void main(String[] args) {
		System.out.println(swapFirstLastAndAppend("hello"));
		System.out.println(swapFirstLastAndAppend("hello world"));
	}
	
	private static String swapFirstLastAndAppend(String str) {
		String[] words = str.split("\\s");
		
		StringBuffer sb = new StringBuffer();
		
		for(String word: words) {
			sb.append(swapFirstLastAndAppendWord(word)+ " ");
		}
		
		return sb.toString().trim();
		
	}

	private static String swapFirstLastAndAppendWord(String str) {
		if (str.length() <= 2)
			return str;

		return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0) + "ay";
	}

}
