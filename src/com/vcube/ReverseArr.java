package com.vcube;

import java.util.Arrays;

public class ReverseArr {

	public static void main(String[] args) {
		int[] arr = {6,3,2,1};
		int left = 0;
		int right = arr.length-1;
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			if(left<right) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right]=temp;
				
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
