package com.nag.arraysortedornot;

import java.util.Scanner;

import com.nag.arraysortedornot_app.ArraySortedOrNot;

public class CheckIfArraySortedOrNot {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int[] a = takeArrayInput();
		if (a != null) {
			ArraySortedOrNot arraySortedOrNot = new ArraySortedOrNot();
			int result = arraySortedOrNot.arraySortedOrNot(a, a.length);
			if (result == 0)
				System.out.println("Array not sorted");
			else if (result == 1)
				System.out.println("Array sorted");
		}
	}

	public static int[] takeArrayInput() {
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] a = null;
		if (n > 0) {
			a = new int[n];
			System.out.println("Enter " + n + " elements of the array");
			for (int i = 0; i < n; i++) {
				int element = sc.nextInt();
				a[i] = element;

			}
		} else
			System.out.println("Please enter the right size of the array");
		return a;
	}
}
