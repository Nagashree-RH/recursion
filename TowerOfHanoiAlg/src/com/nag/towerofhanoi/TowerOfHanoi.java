package com.nag.towerofhanoi;

public class TowerOfHanoi {

	/**
	 * This method prints the steps in which the discs should be moved.
	 * 
	 * @param n - It is the number of discs
	 * @param a - Tower 1
	 * @param b - Tower 2
	 * @param c - tower 3
	 */
	public void towerOfHanoi(int n, int a, int b, int c) {

		if (n > 0) {
			towerOfHanoi(n - 1, a, c, b);
			System.out.println("Move disc " + n + " from tower " + a + " to " + c);
			towerOfHanoi(n - 1, b, a, c);
		}
	}

}
