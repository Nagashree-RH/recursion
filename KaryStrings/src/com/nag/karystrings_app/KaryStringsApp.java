package com.nag.karystrings_app;

import java.util.Scanner;

import com.nag.karystrings.KaryStrings;

public class KaryStringsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println("For k-ary string - enter k value");
			int k = sc.nextInt();
			int[] a = new int[n];
			KaryStrings karyStrings = new KaryStrings();
			karyStrings.genrateKaryStrings(a, n, k);
		} else
			System.out.println("Error : Enter the right size of the array");

	}

}
