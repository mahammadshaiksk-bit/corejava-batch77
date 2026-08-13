package com.vcube;

import java.util.Arrays;

public class ArrSort {

	public static void main(String[] args) {
		int[] arr = {3,5,2,1,6,4};
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(arr));
		int temp =0;
		for(int i=0;i<arr.length-1;i++) {
			int minIndex = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]= temp;
		}
		System.out.println("After sorting...");
		System.out.println(Arrays.toString(arr));
	}

}
