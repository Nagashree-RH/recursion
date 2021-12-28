package com.nag.binarystrings;

public class GenrateBinaryStrings {

	/**
	 * It prints all possible binary strings for th given size n. Example if n is 2
	 * , then 4 combinations of binary strings are possible. O(2^n) is the time
	 * complexity.
	 * 
	 * @param a
	 * @param n
	 */
	public void binaryStrings(int[] a, int n) {
		if (n < 1)
			printArray(a);
		else {
			a[n - 1] = 0;
			binaryStrings(a, n - 1);
			a[n - 1] = 1;
			binaryStrings(a, n - 1);
		}
	}

	private void printArray(int[] a) {
        System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);

		}
	}
}
