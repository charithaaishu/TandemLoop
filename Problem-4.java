package com.tendom;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arraysize = sc.nextInt();
		int[] userdefinedarray = new int[arraysize];
		for (int i = 0; i < arraysize; i++) {
			System.out.println("enter the value for " + (i + 1) + " position");
			userdefinedarray[i] = sc.nextInt();
		}
		System.out.print("{ ");
		for (int i = 1; i <= 9; i++) {
			int count = 0;
			for (int j = 0; j < userdefinedarray.length; j++) {
				int value = userdefinedarray[j];
				if (value % i == 0) {
					count = count + 1;
				}
			}
			System.out.print(i + ": " + count);
			if (i != 9) {
				System.out.print(", ");
			}

		}
		System.out.print("}");

	}

}
