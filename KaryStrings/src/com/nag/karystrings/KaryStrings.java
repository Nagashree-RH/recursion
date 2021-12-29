package com.nag.karystrings;

public class KaryStrings {

	public void genrateKaryStrings(int[] a, int n, int k) {
		if (n < 1) {
			// This will be base case. It means the n bits have been assigned values and it
			// can be printed out.
			printArray(a);
		}

		else {
			for (int i = 0; i < k; i++) {
				a[n - 1] = i;
				genrateKaryStrings(a, n - 1, k);
			}
		}
	}

	private void printArray(int[] a) {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
