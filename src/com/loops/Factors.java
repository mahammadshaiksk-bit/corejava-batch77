package com.loops;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a value: ");
		int n = sc.nextInt();
		findFactors(n);
	}

	static void findFactors(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
