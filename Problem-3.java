package com.tendom;

import java.util.Scanner;

class Problem2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		int a = sc.nextInt();
		printseries(a);
	}

	public static void printseries(int number) {
		if (number <= 0) {
			System.out.println("invalid number");
		} else {
			int value = 0;
			if (number % 2 == 0) {
				value = number - 1;
			} else {
				value = number;
			}
			for (int i = 1; i <= value; i++) {
				int calculate = (i * 2) - 1;
				System.out.print(calculate);
				if (i != value) {
					System.out.print(", ");
				}
			}
		}
	}
}
