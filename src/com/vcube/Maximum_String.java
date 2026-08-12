package com.vcube;

public class Maximum_String {

	public static void main(String[] args) {
		String[] names = {"clerk","sri","gandhi","Mohammad","Independence","Bharath"};
		int max = names[0].length();
		int min = names[0].length();
		String str=names[0];
		String str1=names[0];
		for(String n : names) {
			if(n.length()>max) {
				max = n.length();
				str = n;
			}else if(n.length()<min) {
				min = n.length();
				str1 = n;
			}
		}
		System.out.println("The maximum string in the array is : "+str);
		System.out.println("The minimum string in the array is : "+str1);
	}

}