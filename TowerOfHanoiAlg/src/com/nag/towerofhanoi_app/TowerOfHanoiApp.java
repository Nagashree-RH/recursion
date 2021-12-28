package com.nag.towerofhanoi_app;

import java.util.Scanner;

import com.nag.towerofhanoi.TowerOfHanoi;

public class TowerOfHanoiApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TowerOfHanoi hanoi = new TowerOfHanoi();
		while (true) {
			System.out.println("1. Try the game");
			System.out.println("2. Exit");

			System.out.println("Enter the choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter the number of discs");
				int n = sc.nextInt();
				hanoi.towerOfHanoi(n, 1, 2, 3);
				break;

			case 2:
				sc.close();
				System.exit(0);

			default:
				System.out.println("Wrong option");
			}

		}

	}

}
