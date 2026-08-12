package com.vcube;

public class SecondMin{
    public static void main(String[] args){
        int[] arr = {4,6,8,1,3,2,5,7};
        int min = arr[0];
        int secmin = arr[1];
        if(secmin<min){
            int temp = min;
            min = secmin;
            secmin =temp;
        }
        for(int i = 2;i<arr.length;i++){
            if(min>arr[i]){
                secmin = min;
                min = arr[i];
            }
            else if(secmin>arr[i] && arr[i]>min){
                secmin = arr[i];
            }
        }
        System.out.println(secmin);
    }
}