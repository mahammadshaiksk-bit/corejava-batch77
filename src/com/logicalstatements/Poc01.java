package com.logicalstatements;

import java.util.Scanner;

public class Poc01 {

	public static void main(String[] args) {

		System.out.println("Welcome to Market!!");

		Scanner sc = new Scanner(System.in);

		double vegPrice = 0;
		double fruPrice = 0;
		double totalPrice = 0;
		String cyn = "";
		do {
			System.out.println("enter the category: ");
			String catg = sc.next();
			switch (catg) {
			case "veg" -> {
				String vyn = "";
				do {
					System.out.print("enter the item: ");
					String item = sc.next();
					switch (item) {
					case "tmt" -> {
						System.out.println("The one kg of tomato is 40.0");
						double tmtPrice = 40.0;
						vegPrice += tmtPrice;

					}
					case "ptt" -> {
						System.out.println("The one kg of potato is 30.0");
						double pttPrice = 30.0;
						vegPrice += pttPrice;
					}
					case "onn" -> {
						System.out.println("The one kg of onion is 35.0");
						double onnPrice = 35.0;
						vegPrice += onnPrice;
					}
					case "crt" -> {
						System.out.println("The one kg of carrot is 50.0");
						double crtPrice = 50.0;
						vegPrice += crtPrice;
					}
					case "brn" -> {
						System.out.println("The one kg of brinjal is 45.0");
						double brnPrice = 45.0;
						vegPrice += brnPrice;
					}
					default -> System.out.println("entered item is not Available..");
					}
					System.out.println("Do you want continue with vegetables then enter y");
					vyn = sc.next();
				} while (vyn.equalsIgnoreCase("y"));
				System.out.println("Total price of the Vegetales is: " + vegPrice);
				totalPrice += vegPrice;
			}
			case "fru" -> {
				String fyn = "";
				do {
					System.out.println("enter the Fruit Name: ");
					String name = sc.next();
					switch (name) {
					case "mgo" -> {
						System.out.println("1 kg mangos is 120.0");
						double mgoPrice = 120;
						fruPrice += mgoPrice;
					}
					case "apl" -> {
						System.out.println("1 kg apples is 180.0");
						double aplPrice = 180;
						fruPrice += aplPrice;
					}
					case "ban" -> {
						System.out.println("1 kg bananas is 60.0");
						double banPrice = 60;
						fruPrice += banPrice;
					}
					case "org" -> {
						System.out.println("1 kg oranges is 100.0");
						double orgPrice = 100;
						fruPrice += orgPrice;
					}
					case "grp" -> {
						System.out.println("1 kg grapes is 90.0");
						double grpPrice = 90;
						fruPrice += grpPrice;
					}
					default -> System.out.println("entered fruit is not available.");
					}
					System.out.println(
							"Do you want continue with fruits .... then enter Y other wise enter other any letter or symbol..");
					fyn = sc.next();
				} while (fyn.equalsIgnoreCase("y"));
				System.out.println("Total price of the Fruits is: " + fruPrice);
				totalPrice += fruPrice;
			}
			default -> System.out.println("entered category is not available...");
			}
			System.out.println("Do you continue then enter 'y' or else enter symbol or letter ");
			cyn = sc.next();
		} while (cyn.equalsIgnoreCase("y"));
		System.out.println("Total price of the Vegetales and Fruits price is: " + totalPrice);

	}

}
