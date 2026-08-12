package com.vcube;

public class Maximum_Minimum_Array {
	public static void main(String[] args) {
		int[] arr = {10,20,40,6,30};
		int max = arr[0];
		int min = arr[0];
		for(int a : arr) {
			if(a<min) {
				min = a;
			}else if(a>max) {
				max = a;
			}
		}
		System.out.println("The minimum value in the array is :  "+min);
		System.out.println("The maximum value in the array is :  "+max);
	}
}
