package com.vcube;

import java.util.Arrays;

public class Target {

	public static void main(String[] args) {
		int[] arr = {2,3,6,8,9,11,12,13,7};
		int left=0;
		int right = arr.length-1;
		int target = 26;
		boolean status = false;
		Arrays.sort(arr);
		while(left<right) {
			int sum = arr[left]+arr[right];//14
			if(sum == target) {
				System.out.println(arr[left]+" + "+arr[right]+" -> "+sum);
				left++;
				right--;
				status = true;
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
		}
		if(!status) {
			System.out.println("not found a pair");
		}
	}

}
