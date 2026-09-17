package com.loops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value: ");
		int n = sc.nextInt();
		boolean status = isPerfect(n);
		if(status) {
			System.out.println("The given Number is Perfect Number.");
		}else {
			System.out.println("The given Number is not Perfect Numbber.");
		}
	}
	static boolean isPerfect(int n) {
		boolean flag = false;
		int sum =0;
		for(int i=1;i<= n/2;i++) {
			if(n%i == 0) {
				sum += i;
			}
		}
		if(sum == n) {
			flag = true;
		}
		return flag;
	}

}
