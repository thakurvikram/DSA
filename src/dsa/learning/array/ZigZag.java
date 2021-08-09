package dsa.learning.array;

public class ZigZag {

	public static void main(String[] args) {
		int[] a = { 9, 6, 6, 6, 2 };

		a = zigZag(a);

		for (Integer i : a) {
			System.out.print(i);
		}
	}

	private static int[] zigZag(int[] a) {

		boolean flag = true;
		int temp = 0;
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (flag) {// check greater than condition
				if (a[i] < a[i + 1]) {
					// swap
					count++;
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
				flag = false;
			} else { // check less than condition
				if (a[i] > a[i + 1]) {
					count++;
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
				flag = true;
			}

		}
		System.out.println(count);
		return a;
	}

}
