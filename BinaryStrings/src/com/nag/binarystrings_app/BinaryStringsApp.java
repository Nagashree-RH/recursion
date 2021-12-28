package com.nag.binarystrings_app;

import java.util.Scanner;

import com.nag.binarystrings.GenrateBinaryStrings;

public class BinaryStringsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n = sc.nextInt();
		if(n>0) {
		int[] a = new int[n];
		GenrateBinaryStrings genrateBinaryStrings = new GenrateBinaryStrings();
		genrateBinaryStrings.binaryStrings(a, n);
		}else
			System.out.println("Enter the right size of array");
		sc.close();

	}

}
