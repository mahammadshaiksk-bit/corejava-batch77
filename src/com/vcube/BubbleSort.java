package com.vcube;

import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args){
        int[] arr = {4,2,6,8,1,9,3};
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr));
        boolean status = false;
        int temp =0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                    status = true;
                }
            }
            if(!status){
                break;
            }
        }
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));
    }
}
