package com.loops;

import java.util.Scanner;

public class FibonacciNumber {

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
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<a;i++) {
			n3 = n1+n2;
			System.out.print(n3+" ");
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
	}

}
