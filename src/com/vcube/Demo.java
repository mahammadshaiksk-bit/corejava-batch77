package com.vcube;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
	}
}
