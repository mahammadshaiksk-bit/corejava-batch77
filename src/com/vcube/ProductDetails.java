package com.vcube;

public class ProductDetails {
	int productid;
	String productName;
	int price;
	String productinfo;
	static String companyName="VCube software solutions";
	{
			System.out.println("companyName: "+ companyName);
	}
	public void show() {
		System.out.println(productid);
		System.out.println(productName);
		System.out.println(price);
		System.out.println(productinfo);
		
	}
	
	public static void main(String[] args) {
		ProductDetails p = new ProductDetails();
		p.productid=1;
		p.productName="Hp Laptop";
		p.price = 50000;
		p.productinfo = "512Gb Rom, 8gb ram";
		p.show();
	}

}
