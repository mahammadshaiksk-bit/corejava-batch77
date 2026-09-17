package com.logicalstatements;

import java.util.Scanner;

public class NaukriPoc {

	public static void main(String[] args) {

		System.out.println("Welcome To Naukri");

		Scanner sc = new Scanner(System.in);

		System.out.print("enter your Name: ");
		String name = sc.nextLine();

		System.out.print("enter your Age: ");
		int age = sc.nextInt();
		sc.nextLine();
		if (age > 20 && age < 36) {
			System.out.print("enter Your Qualification: ");
			String qualification = sc.nextLine();
			if (qualification.equalsIgnoreCase("BTech") || qualification.equalsIgnoreCase("MCA")) {
				System.out.print("enter your Experiance: ");
				int experiance = sc.nextInt();
				sc.nextLine();
				if (experiance >= 2) {
					System.out.print("enter your Skill: ");
					String skill = sc.nextLine();
					if (skill.equalsIgnoreCase("java") || skill.equalsIgnoreCase("Python")
							|| skill.equalsIgnoreCase("Mysql")) {
						System.out.print("enter the Expected Salary: ");
						double salary = sc.nextDouble();
						sc.nextLine();
						if (salary > 0 && salary < 1000000) {
							System.out.print("Job Location Recomdation: ");
							String location = sc.nextLine();
							if (location.equalsIgnoreCase("Hyderabad") || location.equalsIgnoreCase("Bangalore")) {
								System.out.println("Congratulations Mahammad!");
								System.out.println("Your profile matches the job requirements.");
								System.out.println("We can send the offer letter to your mail.");
							} else {
								System.out.println("Sorry! your recommend location is not matched!");
							}
						} else {
							System.out.println("Your salary Expection is too high");
						}
					} else {
						System.out.println("your skill is not mattching with our requirements!");
					}
				} else {
					System.out.println("Experiance is not matching ");
				}
			} else {
				System.out.println("Qualification is not matching");
				System.out.println("You can leave for the day!");
			}
		} else {
			System.out.println("Your Age is not Eligible for these job");
			System.out.println("You can leave for the Day!");
		}
		sc.close();
	}

}
