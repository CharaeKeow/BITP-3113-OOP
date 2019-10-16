public class CarManager {
	
	//As we still have no DB for now, array is used
	//to simulate dealing with DB
	private Car[] cars; 
	//Why private? Because we want only this obj to access 
	//this class
	
	private int count; //Keep track of num of items in array
	
	//Constructor (same as class name)
	public CarManager(int length) {
		cars = new Car[length]; //creating new object!
	}
	
	int addCar(Car car) {
		int status = 0;
		
		if (count < cars.length) {			
			//cars[count] = car; //add to array
			//count++;
			
			cars[count++] = car; //simplicied, using post-increment
			status = count; 
		}
		
		return status; //check if addition is successful
	}
	
	void displayCars() {
		for (Car car: cars) { //For every car object in car array. Much much sweeter
			//for (int i = 0; i < cars.length; i++)
			//Car car = cars[i];
			
			if (car != null) {
				displayCar(car);
			}
		}
	}
	
	void displayCars(double maxPrice) {
		for (Car car: cars) {			
			if (car != null && (car.getPrice() <= maxPrice)) {
				displayCar(car);
			}
		}
	}
	
	void displayCars(int minCapacity) {
		for (Car car: cars) { 			
			if (car != null && (car.getCapacity() >= minCapacity)) {
				displayCar(car);
			}
		}
	}
	
	void displayCars(boolean auto) {
		for (Car car: cars) { 			
			if (car != null && (car.isAuto() == auto)) {
				displayCar(car);
			}
		}
	}
	
	void displayCars(String model) {
		for (Car car: cars) { 			
			if (car != null && car.getModel().toLowerCase().contains(model.toLowerCase())) {
				displayCar(car);
			}
		}
	}
	
	private void displayCar(Car car) {
		System.out.println("Car ID: " + car.getCarID());
		System.out.println("Car ID: " + car.getCarID());
		System.out.println("Plate No: " + car.getPlateNo());
		System.out.println("Model: " + car.getModel());
		System.out.println("Price: " + car.getPrice());
		System.out.println("Capacity: " + car.getCapacity());
		System.out.println("Is Auto: " + car.isAuto());
		System.out.println("Is Usable: " + car.isUsable());
		System.out.println();
	}
	
	//Add car - add to the first available space
	/*
	int updateCar(Car car) {
		int index = -1;
		
		for (int i = 0; i < cars.length; i++) {
			Car temp = cars[i];
			
			if (temp = null) {
				cars[i] = car;
				index = i;
				break; //stop the looping if found
			}
		}
		
		return index; //that has been updated;
	} */
	
	//Update method
	
	int updateCar(Car car) {
		int index = -1;
		
		for (int i = 0; i < cars.length; i++) {
			Car temp = cars[i];
			
			if (temp != null && temp.getCarID() == car.getCarID()) {
				cars[i] = car;
				index = i;
				break; //stop the looping if found
			}
		}
		
		return index; //that has been updated;
	}
	
	int deleteCar(int carID, Car car) {
		int index = -1;
		
		for (int i = 0; i < cars.length; i++) {
			Car temp = cars[i];
			
			if (temp != null && temp.getCarID() == carID) {
				cars[i] = car;
				index = i;
				break;
			}
		}
		
		return index; //that has been updated;
	}
}