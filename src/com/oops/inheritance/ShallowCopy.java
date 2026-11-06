package com.oops.inheritance;

class Customer implements Cloneable{
	
	int cid;
	String cname;
	Address address;
	public Customer(int cid, String cname, Address address) {
		this.cid = cid;
		this.cname = cname;
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
}

class Address {

	String city;

	public Address(String city) {
		this.city = city;
	}

}

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Address add = new Address("Hyderabad");
		Customer c1 = new Customer(1,"Sundar",add);
		
		System.out.println(c1.cid);
		System.out.println(c1.cname);
		System.out.println(c1.address.city);
		System.out.println("----------------------");
		
		Customer c2 = (Customer) c1.clone();
		System.out.println(c2.cid);
		System.out.println(c2.cname);
		System.out.println(c2.address.city);
		System.out.println("----------------------");
		
		c2.cid = 102;
		c2.cname = "Mark jugarberg";
		c2.address.city = "Banglore";
		System.out.println(c2.cid);
		System.out.println(c2.cname);
		System.out.println(c2.address.city);
		System.out.println("----------------------");
		System.out.println(c1.cid);
		System.out.println(c1.cname);
		System.out.println(c1.address.city);
		System.out.println("----------------------");
		
		

	}

}
