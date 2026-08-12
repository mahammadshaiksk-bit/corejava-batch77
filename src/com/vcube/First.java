package com.vcube;

public class First {
	static int collegeId;
	static String college_name;
	
	int stuid;
	String name;
	int age;
	public static void main(String[] args) {
		collegeId = 101;
		college_name = "Narayana";
		
		First s1 = new First();
		s1.stuid = 1;
		s1.name ="Mohammad";
		s1.age = 22;
		System.out.println("obj1 Details..........................");
		System.out.println(collegeId);
		System.out.println(college_name);
		System.out.println(s1.stuid);
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		collegeId = 102;
		college_name = "LVR";
		
		First s2 = new First();
		s2.stuid = 2;
		s2.name ="Alice";
		s2.age = 20;
		System.out.println("obj2 Details..........................");
		System.out.println(collegeId);
		System.out.println(college_name);
		System.out.println(s2.stuid);
		System.out.println(s2.name);
		System.out.println(s2.age);
		
		
	}
}