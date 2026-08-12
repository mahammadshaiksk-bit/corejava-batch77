package com.vcube;

public class Task2 {
	static void main1() {
		System.out.println("Method 1 called");
		Task2 t1 = new Task2();
		t1.main2();
	}
	void main2() {
		System.out.println("Method 2 called");
		main3();
	}
	static void main3() {
		System.out.println("Method 3 called");
		Task2 t1 = new Task2();
		t1.main4();
	}
	void main4() {
		System.out.println("Method 4 called");
		main5();
	}
	static void main5() {
		System.out.println("Method 5 called");
	}

	public static void main(String[] args) {
		System.out.println("method method started!! ");
		Task2 t1 = new Task2();
		main1();
		
		System.out.println("method method ended!! ");
	}

}
