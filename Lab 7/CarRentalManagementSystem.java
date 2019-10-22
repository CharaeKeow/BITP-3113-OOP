package view;
//Because we wanna do menu here and it involve interaction by user.

import java.util.Scanner; //akin to cin in Java

public class CarRentalManagementSystem extends View {	
	public void displayOptions() {
		System.out.println("Welcome to Car Rental Management System");
		System.out.println("=======================================");
		System.out.println("1. Manage cars");
		System.out.println("2. Manage customers");
		System.out.println("3. Manage rentals");
		System.out.println("4. Exit");
	}
	
	public void processOption(Scanner scanner, int choice) {
		if (choice == 1) {
			CarView cv = new CarView();
			
			cv.displayOptions();
			cv.selectOption(scanner, 10);
			displayOptions();
		}  else if (choice == 2) {
			System.out.println("You've selected manage customers");
		} else if (choice == 3) {
			System.out.println("You've selected manage rentals");
		}
	}
		
	// public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CarRentalManagementSystem crms = new CarRentalManagementSystem();
		
		crms.displayOptions();
		crms.selectOption(scanner, 4);		
	}		
	
	/* {***TODO***}
	do {
			choice = 0;
			
			while(choice < 1|| choice > 4) { //While until valid input is printed
				System.out.print("Please enter an option: ");
				choice = scanner.nextInt();
				
				if (choice < 1 || choice > 4) {
					System.out.println("Invalid option, please try again");
				} else if (choice == 1) {
					System.out.println("You've selected manage cars");
					
					while (choice < 10 || choice > 10) {
						if (choice == 1) {
							CarView cv = new CarView()
							cv.displayMenu(scanner);
						} else if (choice == 2) {
							
						} else if (choice == 3) {
							
						} else if (choice == 4) {
							
						} else if (choice == 5) {
							
						} else if (choice == 6) {
							
						} else if (choice == 7) {
							
						} else if (choice == 8) {
							
						} else if (choice == 9) {
							
						} else if (choice == 10) {
							
						}
					}
					} else if (choice == 2) {
						System.out.println("You've selected manage customers");
					} else if (choice == 3) {
						System.out.println("You've selected manage rentals");
					}
				}
			} while(choice != 4);
		}		
	}
	*/
}