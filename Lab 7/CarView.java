package view;

import java.util.Scanner;

public class CarView extends View {
	public void displayOptions() {
		System.out.println("Manage Cars");
		System.out.println("-----------");
		System.out.println("1. Add cars"); 
		System.out.println("2. Update cars");
		System.out.println("3. Delete cars");
		System.out.println("4. Display all cars");
		System.out.println("5. Display cars by maximum price");
		System.out.println("6. Display cars by minimum capacity");
		System.out.println("7. Display cars by transmission");
		System.out.println("8. Display cars by model");
		System.out.println("9. Display single car");
		System.out.println("10. Back to main menu");
	} 
	
	public void processOption(Scanner scanner, int choice) {
		//{***TODO***}
		if (choice == 1) {
			//call addCar method here
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
}