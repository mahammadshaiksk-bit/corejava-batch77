package com.loops;

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		System.out.println("Main method Started!!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();

		getFibonacciNumbers(n);
		System.out.println("main method Ended!!");
	}

	static void getFibonacciNumbers(int a) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int count = 2;
		if (a <= 0) {
			System.out.println("Not defined");
		} else if (a == 1) {
			System.out.println(a + "th fibonacci Number is: " + 0);
		} else if (a == 2) {
			System.out.println(a + "th fibonacci Number is: " + 1);
		} else {
			for (;;) {
				n3 = n1 + n2;
				count++;
				if (count == a) {
					System.out.print(n3 + " ");
					break;
				}
				n1 = n2;
				n2 = n3;
			}
			System.out.println();
		}
	}

}
