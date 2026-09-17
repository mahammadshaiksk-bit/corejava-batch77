package com.logicalstatements;

import java.util.Scanner;

public class Poc2 {

	public static void main(String[] args) {

		System.out.println("================= Welcome to My Store =================");

		Scanner sc = new Scanner(System.in);

		System.out.print("enter the Customer Name: ");
		String customerName = sc.nextLine();

		System.out.print("enter Mobile Number: ");
		long phoneNumber = sc.nextLong();

		System.out.print("Enter Address: ");
		String address = sc.next();

		double cartTotal = 0;
		double discount = 0;
		double finalAmount = 0;
		int nod = 0;

		String bill = "";
		String myn = "";
		do {
			System.out.println("============== Main Menu ===================");
			System.out.println("1. Customer Details");
			System.out.println("2. Shopping Products");
			System.out.println("3. View Cart");
			System.out.println("4. Apply Discount");
			System.out.println("5. CheckOut");
			System.out.println("6. Exit");

			System.out.println("enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				System.out.println("Name of the Customer :" + customerName);
				System.out.println("Mobile Number of the Customer :" + phoneNumber);
				System.out.println("Address of the customer: " + address);
			}
			case 2 -> {
				String syn = "";
				do {
					System.out.println("=================== CATEGORIES ===============");
					System.out.println("1. Electronics");
					System.out.println("2. Clothing");
					System.out.println("3. Grocery");
					System.out.println("4. Food");
					System.out.println("5. Back to Main Menu");

					System.out.println("enter your Category: ");
					int category = sc.nextInt();
					switch (category) {
					case 1 -> {
						String eyn = "";
						do {
							System.out.println("======== Electronis ==========");
							System.out.println("mob    ->  Mobile     -> 15000/-");
							System.out.println("lap    ->  Laptop    -> 50000/-");
							System.out.println("ear    ->  Earbuds     -> 2000/-");
							System.out.println("wat    ->  Smart Watch     -> 3000/-");

							System.out.println("enter the electronic device: ");
							String elecDevice = sc.next();
							switch (elecDevice) {
							case "mob" -> {
								nod++;
								System.out.println("Mobile Price is 15000/-");
								double mobPrice = 15000.0;

								System.out.println("enter the Quantity: ");
								int quantity = sc.nextInt();

								double mobTotal = mobPrice * quantity;
								cartTotal += mobTotal;

								bill += nod + " Mobile    " + quantity + "    " + mobPrice + "    " + mobTotal + "\n";
								System.out.println("Mobile added to the cart Successfully.");
							}
							case "lap" -> {
								nod++;
								System.out.println("Laptop Price is 50000/-");
								double lapPrice = 50000;

								System.out.println("enter the Quantity: ");
								int quantity = sc.nextInt();

								double lapTotal = lapPrice * quantity;
								cartTotal += lapTotal;

								bill += nod + " Laptop    " + quantity + "    " + lapPrice + "    " + lapTotal + "\n";

								System.out.println("Laptop added to the cart Successfully.");
							}
							case "ear" -> {
								nod++;
								System.out.println("EarBuds Price is 2000/-");
								double earPrice = 2000;

								System.out.println("enter the Quantity: ");
								int quantity = sc.nextInt();

								double earTotal = earPrice * quantity;
								cartTotal += earTotal;

								bill += nod + " EarBuds    " + quantity + "    " + earPrice + "    " + earTotal + "\n";

								System.out.println("Earbuds added to the cart Successfully.");
							}
							case "wat" -> {
								nod++;
								System.out.println("Smart Watch Price is 3000/-");
								double watPrice = 3000;

								System.out.println("enter the Quantity: ");
								int quantity = sc.nextInt();

								double watTotal = watPrice * quantity;
								cartTotal += watTotal;

								bill += nod + " Smart Watch    " + quantity + "    " + watPrice + "    " + watTotal
										+ "\n";

								System.out.println("Smart Watch added to the cart Successfully.");
							}
							default -> System.out.println("entered electronic device is not available.");
							}
							System.out.println("Do you want continue Electronic Devices enter y or else any letter");
							eyn = sc.next();
						} while (eyn.equalsIgnoreCase("y"));

					}
					case 2 -> {
						String cyn = "";
						do {
							System.out.println("=========== Clothing =============");
							System.out.println(" shi  -> Shirts    -> 450/- ");
							System.out.println(" pan   -> Pants    -> 1000/- ");
							System.out.println(" tshi   -> T-Shirts   -> 350/- ");
							System.out.println(" sho -> Shorts   -> 250/- ");

							System.out.println("enter the type of Dress: ");
							String dress = sc.next();
							switch (dress) {
							case "shi" -> {
								nod++;
								System.out.println("The cost of shirt is: 450");
								double shiPrice = 450;

								System.out.println("how many shirts you want...");
								int quantity = sc.nextInt();

								double shiTotal = shiPrice * quantity;
								cartTotal += shiTotal;

								bill += nod + " Shirt    " + quantity + "    " + shiPrice + "    " + shiTotal + "\n";

								System.out.println("Shirts added to the cart Successfully.");
							}
							case "pan" -> {
								nod++;
								System.out.println("The cost of pant is: 1000");
								double panPrice = 1000;

								System.out.println("how many pants you want...?");
								int quantity = sc.nextInt();

								double panTotal = panPrice * quantity;
								cartTotal += panTotal;

								bill += nod + " Pant    " + quantity + "    " + panPrice + "    " + panTotal + "\n";

								System.out.println("pants added to the cart Successfully.");
							}
							case "tshi" -> {
								nod++;
								System.out.println("The cost of T-shirt is: 350");
								double tshiPrice = 350;

								System.out.println("how many T-shirts you want...?");
								int quantity = sc.nextInt();

								double tshiTotal = tshiPrice * quantity;
								cartTotal += tshiTotal;

								bill += nod + " T-Shirt    " + quantity + "    " + tshiPrice + "    " + tshiTotal
										+ "\n";

								System.out.println("T-shirts added to the cart Successfully.");
							}
							case "sho" -> {
								nod++;
								System.out.println("The cost of short is: 250");
								double shoPrice = 250;

								System.out.println("how many shorts you want...?");
								int quantity = sc.nextInt();

								double shoTotal = shoPrice * quantity;
								cartTotal += shoTotal;

								bill += nod + " Short    " + quantity + "    " + shoPrice + "    " + shoTotal + "\n";

								System.out.println("shorts added to the cart Successfully.");
							}
							default -> System.out.println("Entered dress is not Available.");
							}
							System.out.println("Do you want continue with clothing ..then enter y");
							cyn = sc.next();
						} while (cyn.equalsIgnoreCase("y"));
					}
					case 3 -> {
						String gryn = "";
						do {
							System.out.println("=========== Grociery =============");
							System.out.println(" ric  -> Rice  -> 700/- ");
							System.out.println(" dal  -> Dal  -> 120/-");
							System.out.println(" sug  -> Sugar -> 50/-");
							System.out.println(" oil -> Cooking Oil -> 150/-");

							System.out.println("enter grociery: ");
							String gro = sc.next();
							switch (gro) {
							case "ric" -> {
								nod++;
								System.out.println("The cost of rice is: 700");
								double ricPrice = 700;

								System.out.println("how many rice bags you want...?");
								int quantity = sc.nextInt();

								double ricTotal = ricPrice * quantity;
								cartTotal += ricTotal;

								bill += nod + " Rice    " + quantity + "    " + ricPrice + "    " + ricTotal + "\n";

								System.out.println("Rice added to the cart Successfully.");
							}
							case "dal" -> {
								nod++;
								System.out.println("The cost of 1kg dal is: 120");
								double dalPrice = 120;

								System.out.println("how many kgs dal do you want...?");
								int quantity = sc.nextInt();

								double dalTotal = dalPrice * quantity;
								cartTotal += dalTotal;

								bill += nod + " Dal    " + quantity + "    " + dalPrice + "    " + dalTotal + "\n";

								System.out.println("dal added to the cart Successfully.");
							}
							case "sug" -> {
								nod++;
								System.out.println("The cost of 1kg Sugar is: 50");
								double sugPrice = 50;

								System.out.println("how many kgs sugar do you want...?");
								int quantity = sc.nextInt();

								double sugTotal = sugPrice * quantity;
								cartTotal += sugTotal;

								bill += nod + " Sugar    " + quantity + "    " + sugPrice + "    " + sugTotal + "\n";

								System.out.println("Sugar added to the cart Successfully.");
							}
							case "oil" -> {
								nod++;
								System.out.println("The cost of 1 liter Oil is: 150");
								double oilPrice = 150;

								System.out.println("how many litres  do you want...?");
								int quantity = sc.nextInt();

								double oilTotal = oilPrice * quantity;
								cartTotal += oilTotal;

								bill += nod + " Cooking Oil    " + quantity + "    " + oilPrice + "    " + oilTotal
										+ "\n";

								System.out.println("Cooking Oil added to the cart Successfully.");
							}
							default -> System.out.println("Entered Grocery is not Available.");
							}
							System.out.println("Do you want continue..then enter y ");
							gryn = sc.next();
						} while (gryn.equalsIgnoreCase("y"));
					}
					case 4 -> {
						String fyn = "";
						do {
							System.out.println("=========== Food =============");
							System.out.println(" piz  -> Pizza  -> 250/- ");
							System.out.println(" bur  -> Burger  -> 150/-");
							System.out.println(" fri  -> French Fries -> 100/-");
							System.out.println(" bri  -> Biryani -> 220/-");

							System.out.println("enter Food Item");
							String item = sc.next();
							switch (item) {
							case "piz" -> {
								nod++;
								System.out.println("The cost of Pizza is: 250");
								double pizPrice = 250;

								System.out.println("how many Pizzas do you want...?");
								int quantity = sc.nextInt();

								double pizTotal = pizPrice * quantity;
								cartTotal += pizTotal;

								bill += nod + " Pizza    " + quantity + "    " + pizPrice + "    " + pizTotal + "\n";

								System.out.println("Pizza  added to the cart Successfully.");
							}
							case "bur" -> {
								nod++;
								System.out.println("The cost of Burger is: 150");
								double burPrice = 150;

								System.out.println("how many Burgers do you want...?");
								int quantity = sc.nextInt();

								double burTotal = burPrice * quantity;
								cartTotal += burTotal;

								bill += nod + " Burger    " + quantity + "    " + burPrice + "    " + burTotal + "\n";

								System.out.println("Burger added to the cart Successfully.");
							}
							case "fri" -> {
								nod++;
								System.out.println("The cost French Fri is: 100");
								double friPrice = 100;

								System.out.println("how many French fries do you want...?");
								int quantity = sc.nextInt();

								double friTotal = friPrice * quantity;
								cartTotal += friTotal;

								bill += nod + " French Fri    " + quantity + "    " + friPrice + "    " + friTotal
										+ "\n";

								System.out.println("French fri added to the cart Successfully.");
							}
							case "bri" -> {
								nod++;
								System.out.println("The cost Biryani is: 220");
								double briPrice = 220;

								System.out.println("how many Briyani Packets do you want...?");
								int quantity = sc.nextInt();

								double briTotal = briPrice * quantity;
								cartTotal += briTotal;

								bill += nod + " Biryani    " + quantity + "    " + briPrice + "    " + briTotal + "\n";

								System.out.println("Biryani added to the cart Successfully.");
							}
							default -> System.out.println("Entered Food item is not Available.");
							}
							System.out.println("Do you want continue with food items then enter y");
							fyn = sc.next();
						} while (fyn.equalsIgnoreCase("y"));

					}
					case 5 -> syn = "n";
					default -> System.out.println("Invalid choice");
					}
					System.out.println("Do you want continue with Shopping products y:yes /  N:no ");
					syn = sc.next();
				} while (syn.equalsIgnoreCase("y"));
			}
			case 3 -> {
				System.out.println("=========== View Cart ===============");
				System.out.println("Total Cart Amount: " + cartTotal + " /-");
			}
			case 4 -> {

				if (cartTotal >= 10000) {
					discount = cartTotal * 20 / 100;
				} else if (cartTotal >= 5000) {
					discount = cartTotal * 10 / 100;
				} else if (cartTotal >= 2000) {
					discount = cartTotal * 5 / 100;
				}

				finalAmount = cartTotal - discount;

				System.out.println("=============== DISCOUNT ===============");
				System.out.println("Cart Total: " + cartTotal + "/-");
				System.out.println("Discount: " + discount + "/-");
				System.out.println("Final Amount: " + finalAmount + "/-");
			}
			case 5 -> {
				System.out.println("========== INVOICE ==========");
				System.out.println("Sno||ProductName||Quantity|Price||Total");
				System.out.println("------------------------------------------");
				System.out.println(bill);
				System.out.println("------------------------------------------");
				System.out.println("Cart Total: " + cartTotal);
				System.out.println("==============================");
			}
			case 6 -> {
				myn = "n";
				System.out.println("Thank you for Visitng the My store....");

			}
			default -> {
				System.out.println("Invalid Choice.");
			}
			}

			if (choice != 5 && choice != 6) {
				System.out.println("Do you want continue with menu then click y or else any other letter........");
				myn = sc.next();
			}
		} while (myn.equalsIgnoreCase("y"));

	}

}
