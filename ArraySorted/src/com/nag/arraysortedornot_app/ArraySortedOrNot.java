package com.nag.arraysortedornot_app;

public class ArraySortedOrNot {

	/**
	 * This method uses recursion technique to check if the array is sorted or not ,
	 * and returns the result.
	 * 
	 * @param array
	 * @param n
	 * @return 0 if not sorted, 1 if sorted.
	 */
	public int arraySortedOrNot(int[] array, int n) {
		if (n == 1)
			return 1;
		else {
			return array[n - 1] < array[n - 2] ? 0 : arraySortedOrNot(array, n - 1);
		}

	}
}
