package view;

import java.util.Scanner; //akin to cin in Java

public class CarRentalManagementSystem extends View{	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CarRentalManagementSystem crms = new CarRentalManagementSystem();
		
		crms.displayOption();
		crms.selectOption(scanner, 4);
		scanner.close();
	}
	
	@Override
	void displayOption() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Car Rental Management System");
		System.out.println("=======================================");
		System.out.println("1. Manage cars");
		System.out.println("2. Manage customers");
		System.out.println("3. Manage rentals");
		System.out.println("4. Exit");
	}	

	@Override
	void processOption(Scanner scanner, int choice) {
		// TODO Auto-generated method stub
		if (choice == 1) {
			CarView cv = new CarView();
			cv.displayOption();
			cv.selectOption(scanner, 9);
			displayOption();
		} else if (choice == 2) {
			//TODO
		} else if (choice == 3) {
			//TODO
		} else if (choice == 4) {
			//TODO
		}
	}
}
		
	
	