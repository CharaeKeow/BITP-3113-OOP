package view;

import java.util.Scanner;

import controller.manager.CarManager;
import model.Car;

class CarView extends View {
	@Override
	void displayOption() {
		// TODO Auto-generated method stub
		System.out.println("Manage Cars");
		System.out.println("1. Add cars");
		System.out.println("2. Update customers");
		System.out.println("3. Delete rentals");
		System.out.println("4. Display all cars");
		System.out.println("5. Display cats by maximum price");
		System.out.println("6. Display cars by minimum price");
		System.out.println("7. Display cars by transmission");
		System.out.println("8. Display cars by model");
		System.out.println("9. Back to main menu");		
	}

	@Override
	void processOption(Scanner scanner, int choice) {
		// TODO Auto-generated method stub
		if (choice == 1) {
			System.out.println("1. Add cars");
			
			CarManager cm = new CarManager(10);
			Car car = new Car(1);
			
			scanner.nextLine();
			System.out.println("Please enter the car details");
			
			System.out.print("Plate no: ");
			car.setPlateNo(scanner.nextLine());
			
			System.out.print("Model: ");
			car.setModel(scanner.nextLine());
			
			System.out.print("Price: ");
			car.setPrice(scanner.nextDouble());
			
			System.out.print("Capacity: ");
			car.setCapacity(scanner.nextInt());
			
			System.out.print("Auto: ");
			car.setAuto(scanner.nextBoolean());
			
			System.out.print("Usable: ");
			car.setUsable(scanner.nextBoolean());
			
			if (cm.addCar(car) != -1) {
				System.out.println("Successfully added a new car");
			} else {
				System.err.println();
			}
			
		} else if (choice == 2) {
			System.out.println("2. Update customers");
		} else if (choice == 3) {
			System.out.println("3. Delete rentals");
		} else if (choice == 4) {
			System.out.println("4. Display all cars");
			
			CarManager cm = new CarManager(10);
			
			cm.displayCars();
		} else if (choice == 5) {
			System.out.println("5. Display cats by maximum price");
		} else if (choice == 6) {
			System.out.println("6. Display cars by minimum price");
		} else if (choice == 7) {
			System.out.println("7. Display cars by transmission");
		} else if (choice == 8) {
			System.out.println("8. Display cars by model");
		}
	}
}
