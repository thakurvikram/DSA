
public class Test {

	public static void main(String[] args) {

		
		
		int n = 112;
		int reminder = 0;
		int newN = 0;
		while (n != 0) {
			reminder = n % 10;//2
			n = n/10; // 11
			newN = newN * 10 + reminder;
		}
		System.out.println(newN);
	}
}
