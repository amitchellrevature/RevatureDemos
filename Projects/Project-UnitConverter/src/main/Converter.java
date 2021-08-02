package main;
import java.util.Scanner;

public class Converter {
	public static void main(String args[]) {
		int menuSelection = 0;
		int lastSelection = -1;
		int menuChoice = 0;
		Scanner scanner = new Scanner(System.in);
		while (menuSelection != lastSelection) {
			lastSelection = menuSelection;
			System.out.println("Please select an option:\r\n"
					+ "1. Volume Conversions\r\n"
					+ "2. Distance Conversions\r\n"
					+ "3. Quit");
			menuSelection = scanner.nextInt();
			switch (menuSelection) {
				case 1:{
					System.out.println("Volume Conversions:\r\n"
							+ "1. Teaspoons to Tablespoons\r\n"
							+ "2. Teaspoons to Cups\r\n"
							+ "3. Quit");
					menuChoice = scanner.nextInt();
					switch (menuChoice) {
						case 1:{
							System.out.println(0.333 * retrieve(scanner, " Teaspoons ") + " Tablespoons\r\n");
							break;
						}
						case 2:{
							System.out.println(0.021 * retrieve(scanner, " Teaspoons ") + " Cups\r\n");
							break;
						}
						case 3:{
							System.exit(0);
							break;
						}
					}
					break;
				}
				case 2:{
					System.out.println("Distance Conversions:\r\n"
							+ "1. Feet to Meters\r\n"
							+ "2. Miles to Kilometers\r\n"
							+ "3. Quit");
					menuChoice = scanner.nextInt();
					switch (menuChoice) {
						case 1:{
							System.out.println(0.305 * retrieve(scanner, " Feet ") + " Meters\r\n");
							break;
						}
						case 2:{
							System.out.println(1.609 * retrieve(scanner, " Miles ") + " Kilometers\r\n");
							break;
						}
						case 3:{
							System.exit(0);
							break;
						}
					}
					break;
				}
				case 3:{
					System.exit(0);
					break;
				}
			}
		}
	}
	
	public static double retrieve(Scanner scanner, String type) {
		double amount;
		System.out.println("Enter the amount:");
		amount = scanner.nextInt();
		System.out.println(amount + type + "is equal to ");
		return amount;
	}
}
