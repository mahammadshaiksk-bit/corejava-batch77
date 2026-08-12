package com.vcube;

public class Demo1 {
	static {
		System.out.println("static metod calling!");
	}
	static Demo1 d1 = new Demo1();{
		System.out.println("instance method started!");
		Demo1 d1 = new Demo1();
	}
	public static void main(String[] args) {
		
		System.out.println("main method started!");
		System.out.println("main method ended!");
		
	}

}
