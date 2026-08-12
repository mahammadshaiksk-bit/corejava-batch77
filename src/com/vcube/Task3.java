package com.vcube;

public class Task3 {
	String name ="Dell";
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalized!!");
	}
	void m1() {
		System.out.println("m1 called!");
		
		//4. method inside the object
		Task3 t = new Task3();
		System.out.println(t.name);
	}
	
	public static void main(String[] args) {
		Task3 t3 = new Task3();
		System.out.println(t3);
		
		Task3 t4 = new Task3();
		System.out.println(t4);
		//2.Re initializing objects
		t3 = t4;
		
		System.out.println(t3);
		System.out.println(t4);
		
		//3.Anonymous objects
		new Task3();
		
		System.gc();
	}

}
