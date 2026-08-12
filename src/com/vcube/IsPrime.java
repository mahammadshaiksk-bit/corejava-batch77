package com.vcube;

public class IsPrime {
	public static boolean isPrime(int a) {
		boolean status =true;
		if(a==0 || a == 1) {
			return false;
		}
		else if(a>1) {
			for(int i=2;i<a;i++) {
				if(a%i == 0) {
					status = false;
					break;
				}
			}
		}
		return status;
	}
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for(int a : arr) {
			if(isPrime(a)) {
				System.out.print(a+" ");
			}
		}
	}

}
